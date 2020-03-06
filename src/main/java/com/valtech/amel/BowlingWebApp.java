package com.valtech.amel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BowlingWebApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BowlingWebApp.class, args);
    }

    @Bean
    public Docket swaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                // .paths(PathSelectors.ant("/api/*"))
                .apis(RequestHandlerSelectors.basePackage("com.valtech"))
                .build();
                //.apiInfo(apiDetails());
    }

//    private ApiInfo apiDetails() {
//        return new ApiInfo(
//                "Bowling Game Api",
//                "1.0",
//                "free to use",
//                new springfox.documentation.service.Contact("Amel Arbi","http://valtech.com","amel.arbi@valtech.de"),
//                "API License",
//                "http://valtech.com",
//                Collections.emptyList()
//        );


}