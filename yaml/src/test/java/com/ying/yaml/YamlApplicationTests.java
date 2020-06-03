package com.ying.yaml;

import com.ying.yaml.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

    @SpringBootTest
    class YamlApplicationTests {
        @Autowired
        private Person person;
        @Test
        void contextLoads() {
            System.out.println(person);
        }

}
