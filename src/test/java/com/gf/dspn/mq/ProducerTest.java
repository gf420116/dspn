//package com.gf.dspn.mq;
//
//
//import com.gf.dspn.DspnApiApplication;
//import org.apache.rocketmq.client.exception.MQBrokerException;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.remoting.exception.RemotingException;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.io.UnsupportedEncodingException;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = DspnApiApplication.class)
//@TestPropertySource("classpath:application.yml")
//public class ProducerTest {
//
//    @Autowired
//    private Producer producer;
//
//    @Test
//    public void send() {
//        String msg = "hello";
//        try {
//            //测试循环1000次的消息发送消费
//            for (int i = 0; i < 1000000; i++) {
//                producer.send("PushTopic", "push", msg + i);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (RemotingException e) {
//            e.printStackTrace();
//        } catch (MQClientException e) {
//            e.printStackTrace();
//        } catch (MQBrokerException e) {
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//    }
//}