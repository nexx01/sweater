package com.example.sweater.config.initializer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingClass({"org.springframework.boot.test.context.SpringBootTest"})
public class TestEntityInit implements CommandLineRunner {

    private TestDataInitService testDataInitService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddlAuto;


    public TestEntityInit(TestDataInitService testDataInitService) {
        this.testDataInitService = testDataInitService;
    }

    @Override
    public void run(String... args) throws Exception {
        if(ddlAuto.contains("create")){
            testDataInitService.createEntity();
        }

    }
}
