package com.leomcabral.examples.microexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController("/")
public class TestResource {

    @GetMapping("/test")
    public String getEndpoint() throws InterruptedException {
        var randVal = new Random(new Date().getTime()).nextInt(200);
        TimeUnit.MILLISECONDS.sleep(randVal);

        return "Hello world";
    }

    @GetMapping("/testc")
    public String getEnd2() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("vai");
        return "second";
    }

}
