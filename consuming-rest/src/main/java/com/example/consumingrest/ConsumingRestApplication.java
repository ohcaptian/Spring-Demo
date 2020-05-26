package com.example.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
        fetch rest resource
        JsonIgnoreProperties(ignoreUnknown = true),将这个注解写在类上之后，就会忽略类中不存在的字段
 */
@SpringBootApplication
public class ConsumingRestApplication {
    private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestApplication.class, args);
    }
    /*
            RestTemplate是Spring提供的用于访问Rest服务的客户端
     */
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
/*
            CommandLineRunner 预先加载数据;
 */
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quete quote = restTemplate.getForObject(
                    "https://gturnquist-quoters.cfapps.io/api/random", Quete.class);
            log.info(quote.toString());
        };
    }
}
