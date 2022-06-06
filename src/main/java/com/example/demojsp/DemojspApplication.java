package com.example.demojsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//起始类中
@SpringBootApplication
//自己写得xml文件路径，最好在resource下，和properties同级
//因为测试的是，对实体类的赋值注入，所以用的是Spring.xml
@ImportResource(value = "classpath:aass.xml")
public class DemojspApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemojspApplication.class, args);
    }

}
