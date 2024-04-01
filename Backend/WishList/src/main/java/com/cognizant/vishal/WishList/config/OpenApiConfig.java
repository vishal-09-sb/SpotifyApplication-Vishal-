/**
 * 
 */
package com.cognizant.mohit.WishList.config;

/**
 * @author mohit
 *
 */


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class OpenApiConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	OpenAPI customOpenAPI() {
		return new OpenAPI()
				.components(new Components().addSecuritySchemes("bearer-token",
						new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")
								.name("Authorization")))
				.info(new Info().title("WISHLIST-MICROSERVICE")
						.description("@author:github/mohit-app auth for spotify app").version("1.0.0"))
				.addSecurityItem(new SecurityRequirement().addList("bearer-token"));
	}

}

