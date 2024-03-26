package com.example.awsecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsEcsApplication {

  @GetMapping("/api/v1/welcome")
  public String welcome(){
    return "hello aws world";
  }

  @GetMapping("/api/v1/hello")
  public String hello(@RequestParam String user){
    return "hello" + user;
  }

  public String devBranchChange(){
    return "dev changes";
  }

  public String rebaseBranch(){
    return "rebase";
  }
  public static void main(String[] args) {
    SpringApplication.run(AwsEcsApplication.class, args);
  }

}
