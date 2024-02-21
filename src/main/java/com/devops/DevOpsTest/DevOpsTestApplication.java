package com.devops.DevOpsTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOpsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevOpsTestApplication.class, args);


    }

    private void check() {
        var count = 1;
        if (count > 1) {
            return;
        }

        count++;

        ////////


        var count = 1;
        if (count > 1) {
            return;
        } else {
            count++;
        }
    }
}
