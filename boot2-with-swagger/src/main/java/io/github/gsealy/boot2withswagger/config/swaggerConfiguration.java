package io.github.gsealy.boot2withswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Gsealy
 * @date 2019/3/19 10:12
 */
@Configuration
public class swaggerConfiguration {

  @Bean
  public Docket swaggerApi() {
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(swaggerApiInfo()).select() //
        .apis(RequestHandlerSelectors.basePackage("io.github.gsealy.boot2withswagger.controller")) //
        .paths(PathSelectors.any()) //
        .build();
  }

  private ApiInfo swaggerApiInfo() {
    return new ApiInfoBuilder().title("webflux-swagger2 API doc") //
        .description("how to use this") //
        .termsOfServiceUrl("https://github.com/Gsealy") //
        .contact(new Contact("Gsealy", "https://gsealy.github.io", "gsealy@gmail.com")) //
        .version("1.0") //
        .build();
  }
}
