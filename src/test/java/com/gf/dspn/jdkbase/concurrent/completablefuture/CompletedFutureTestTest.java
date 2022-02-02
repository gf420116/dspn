package com.gf.dspn.jdkbase.concurrent.completablefuture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.CompletableFuture;
import org.junit.Test;

public class CompletedFutureTestTest{

    @Test
    public void completedFutureExample() {
        CompletableFuture cf = CompletableFuture.completedFuture("message");
        assertTrue(cf.isDone());
        assertEquals("message", cf.getNow(null));

        System.out.println(cf.isDone());
        System.out.println(cf.getNow(null));
    }

}