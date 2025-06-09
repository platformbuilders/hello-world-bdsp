package com.example.demo;
import com.example.demo.dto.HelloResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

  
   @GetMapping("/")
    public HelloResponse  hello() { 
        String mensagem = "Hello World!";
        String secretValue = System.getenv("secretKey");
        String envDataValue =  System.getenv("dataTest");
        String envVarTest =  System.getenv("envVarTest");

        return new HelloResponse(mensagem, secretValue, envDataValue, envVarTest);
    }
}