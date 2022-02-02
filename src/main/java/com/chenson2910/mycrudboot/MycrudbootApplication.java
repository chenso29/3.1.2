package com.chenson2910.mycrudboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.chenson2910.mycrudboot.repository")
@EntityScan("com.chenson2910.mycrudboot.model")
public class MycrudbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MycrudbootApplication.class, args);
    }

}
