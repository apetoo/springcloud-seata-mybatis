package com.warape.seatstorage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: eureka-seata-mybatis
 * @description:
 * @author: 万明宇 (warApe)
 * @create: 2019-10-14 14:13
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@MapperScan("com.warape.seatstorage.mapper")
public class SeatStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeatStorageApplication.class,args);
    }
}
