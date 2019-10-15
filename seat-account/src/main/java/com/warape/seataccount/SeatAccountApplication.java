package com.warape.seataccount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wanmingyu
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.warape.seataccount.mapper")
public class SeatAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeatAccountApplication.class,args);
    }
}
