package xyz.easyboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
public class DubboProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProviderApplication.class)
                .run(args);
    }

}
