package com.belajar.restapirev.config;

import java.util.Collections;

import org.hibernate.mapping.Collection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import io.swagger.models.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.paths(Predicates.not(PathSelectors.regex("/error/*")))
				.paths(Predicates.not(PathSelectors.regex("/actuator")))
				.build()
				.apiInfo(apiInfo());

	}
	
	private ApiInfo apiInfo() {
		Contact contact = new Contact();
		
		@SuppressWarnings("deprecation")
		ApiInfo output = new ApiInfo("title", "description", "version", "termsOfServiceUrl", "contactName", "license", "licenseUrl");

		return output;
	}
}
