package com.telino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource( { "classpath*:app-config.xml", "classpath*:applicationContext.xml" } )
public class App
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(App.class, args);

        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        System.out.println( "Hello World!" );
    }
}
