package com.warape.seatorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: eureka-seata-mybatis
 * @description:
 * @author: 万明宇 (warApe)
 * @create: 2019-10-14 14:12
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.warape.seatorder.mapper")
@EnableFeignClients
public class SeatOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeatOrderApplication.class,args);
    }
}
