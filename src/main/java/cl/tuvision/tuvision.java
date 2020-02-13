package cl.tuvision;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication

@EnableSwagger2WebMvc	
public class tuvision 
{
	public static void main(String[] args) {
		SpringApplication.run(tuvision.class, args);
	}
	
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
            .apis(RequestHandlerSelectors.basePackage("cl.tuvision"))
            .paths(PathSelectors.ant("/tuvision/**"))
            .build()
            .apiInfo(apiInfo())
            .useDefaultResponseMessages(false)
            .pathMapping("/");
    }
	
	private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("Tu Vision", "Servicios para DJ.", "API 1.0", "Terms of service", new Contact("Sagi", "www.sagi.com", "sergio.cp@hotmail.es"), "License of API", "API license URL", Collections.emptyList());
        return apiInfo;
    }

}
