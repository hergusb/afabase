package ar.hergus.pruebajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebajpaApplication {

    private static final Logger log = LoggerFactory.getLogger(PruebajpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PruebajpaApplication.class, args);
    }

}
