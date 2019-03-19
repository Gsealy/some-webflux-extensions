package io.github.gsealy.boot2withswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

@EnableSwagger2WebFlux
@SpringBootApplication
public class Boot2WithSwaggerApplication {

  public static void main(String[] args) {
    SpringApplication.run(Boot2WithSwaggerApplication.class, args);
  }

}
