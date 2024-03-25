package com.example.awsecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsEcsApplication {

  @GetMapping("/api/v1/welcome")
  public String welcome(){
    return "hello aws world";
  }
  public static void main(String[] args) {
    SpringApplication.run(AwsEcsApplication.class, args);
  }

}