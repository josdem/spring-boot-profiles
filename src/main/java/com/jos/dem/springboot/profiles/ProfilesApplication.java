package com.jos.dem.springboot.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfilesApplication {

  @Value("${user.url}")
  private String userUrl;

  public static void main(String[] args) {
    SpringApplication.run(ProfilesApplication.class, args);
  }

  @Bean
  CommandLineRunner run(){
    return args -> {
      System.out.println("Environment: " + userUrl);
    };
  }

}
