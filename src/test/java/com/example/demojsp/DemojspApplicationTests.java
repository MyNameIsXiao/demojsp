package com.example.demojsp;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemojspApplicationTests {

    @Test
    void contextLoads() {
        System.out.print(1);
       /* ApplicationContext app=new AnnotationConfigApplicationContext(UserConfig.class);
        User user=(User)app.getBean("init");
        user.show();*/

    }

}
