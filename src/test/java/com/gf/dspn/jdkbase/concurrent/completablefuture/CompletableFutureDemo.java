package com.gf.dspn.jdkbase.concurrent.completablefuture;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import org.junit.Test;

/**
 * CompletableFuture的常用场景.
 *
 * @author doublej
 * @date 2022-02-01 16:42
 */
public class CompletableFutureDemo {

    /**
     * 创建CompletableFuture
     * - runAsync
     * - supplyAsync
     * - completedFuture
     * <p>
     * 异步计算启用的线程池是守护线程
     */
    @Test
    public void test1() {
        //1、异步计算：无返回值

        //默认线程池为：ForkJoinPool.commonPool()
        CompletableFuture.runAsync(() -> {
            // TODO: 2018/9/8 无返回异步计算
            System.out.println(Thread.currentThread().isDaemon());
        });

        //指定线程池，（到了jdk9CompletableFuture还拓展了延迟的线程池）
        CompletableFuture.runAsync(() -> {
            // TODO: 2018/9/8 无返回异步计算
        }, Executors.newFixedThreadPool(2));


        //2、异步计算：有返回值

        // 使用默认线程池
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "result1");
        //getNow指定异步计算抛出异常或结果返回null时替代的的值
        String result1 = future1.getNow(null);

        //  指定线程池
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "result2", Executors.newFixedThreadPool(2));
        //getNow指定异步计算抛出异常或结果返回null时替代的的值
        String result2 = future2.getNow(null);


        //3、初始化一个有结果无计算的CompletableFuture
        CompletableFuture<String> future = CompletableFuture.completedFuture("result");
        String now = future.getNow(null);
        System.out.println("now = " + now);
    }

    /**
     * 多个CompletableFuture策略
     * - anyOf：接受一个CompletableFuture数组，任意一个任务执行完返回。都会触发该CompletableFuture
     * - whenComplete：计算执行完之后执行实现的一段代码，将上一个结果和异常作为参数传入
     */
    @Test
    public void test8() throws InterruptedException {

        List<String> messages = Arrays.asList("a", "b", "c");
        CompletableFuture.anyOf(messages.stream().map(o -> CompletableFuture.completedFuture(o).thenApplyAsync(s -> {

            try {
                Thread.sleep(new Random().ints(99, 300).findFirst().getAsInt());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return s.toUpperCase();
        })).toArray(CompletableFuture[]::new)).whenComplete((res, throwable) -> {
            if (throwable == null) {
                System.out.println(res.toString());
            }
        });
        Thread.sleep(1000);
    }

    @Test
    public void test10() throws ExecutionException,InterruptedException {
        CompletableFuture<String> future = CompletableFuture.completedFuture("hello!")
            .thenApply(s -> s + "world!");
        assertEquals("hello!world!", future.get());
        // 这次调用将被忽略。
        future.thenApply(s -> s + "nice!");
        System.out.println(future.get());
        assertEquals("hello!world!", future.get());

    }

    @Test
    public void test11() throws ExecutionException,InterruptedException {
        CompletableFuture<String> future = CompletableFuture.completedFuture("hello!")
            .thenApply(s -> s + "world!").thenApply(s -> s + "nice!");
        System.out.println(future.get());
        assertEquals("hello!world!nice!", future.get());
    }

    @Test
    public void test12() throws InterruptedException {

        List<String> messages = Arrays.asList("a", "b", "c");

        List<CompletableFuture<String>> futures = messages.stream().map(o -> CompletableFuture.completedFuture(o).thenApplyAsync(s -> {
            try {
                Thread.sleep(new Random().ints(99, 300).findFirst().getAsInt());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return s.toUpperCase();
        }).exceptionally(ex -> {
            System.out.println(ex.toString());// CompletionException
            return "exception!";
        }).whenComplete((res, ex) -> {
            // res 代表返回的结果
            // ex 的类型为 Throwable ，代表抛出的异常
            System.out.println(res);
//            // 这里没有抛出异常所有为 null
//            assertNull(ex);
        })).collect(Collectors.toList());

        Thread.sleep(1000);
    }

}
