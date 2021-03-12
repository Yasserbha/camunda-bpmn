package com.lieues.workflow;


import com.lieues.workflow.entities.Employe;
import com.lieues.workflow.entities.Manager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  CommandLineRunner start(){
    return args -> {

      Manager olivier =new Manager(null,"Olivier","olivier@7lieues.io",null);


      Employe ilyes =new Employe(null,"ilyes","ilyes@7lieues.com",olivier,null);
      Employe yasser =new Employe(null,"yasser","yasser@7lieues.com",olivier,null);


    };
  }

}