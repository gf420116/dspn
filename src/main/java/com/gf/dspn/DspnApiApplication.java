package com.gf.dspn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class DspnApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(DspnApiApplication.class, args);
    }
}
