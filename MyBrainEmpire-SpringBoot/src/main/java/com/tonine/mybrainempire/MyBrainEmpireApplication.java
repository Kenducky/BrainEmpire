package com.tonine.mybrainempire;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class MyBrainEmpireApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBrainEmpireApplication.class, args);
        //String[] beanDefinitionNames = run.getBeanDefinitionNames();
        //System.out.println("beanDefinitionNames = " + Arrays.toString(beanDefinitionNames));
        log.info("-------------------now i run!===============");
        log.info("-------------------run by power!===============");
    }


}
