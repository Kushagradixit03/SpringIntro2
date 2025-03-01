package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

    // Corrected Logger initialization using SLF4J's Logger
    private static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

    public static void main(String[] args) {
        // Logging at DEBUG level
        logger.debug("Welcome to Spring Concept");

        // Starting Spring Boot application
        ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);

        // Logging the DemoBean from the Spring context
        logger.debug("Checking Context: {}", context.getBean(DemoBean.class));

        // Example message using @Autowired
        logger.debug("\n*** Example Using @Autowired");
    }
}
