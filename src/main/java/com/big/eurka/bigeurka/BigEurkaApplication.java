package com.big.eurka.bigeurka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class BigEurkaApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BigEurkaApplication.class, args);
        SpringApplication.run(BigEurkaApplication.class, args);
    }

}
