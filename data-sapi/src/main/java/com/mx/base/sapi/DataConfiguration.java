package com.mx.base.sapi;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class DataConfiguration {

	public Docket swaggerSapi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.mx.base.sapi.controller")).paths(PathSelectors.ant(null))
				.build().apiInfo(new ApiInfoBuilder().version("1.0").title("SAPI")
						.description("Documentation Data SAPI V1.0").build());
	}

}
