package com.eduforum.api.forum_api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
    info = @Info(
        title = "API",
        version = "v0.0.1",
        description = "CHALLENGE"
    )
)
@SpringBootApplication
public class ForumApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumApiApplication.class, args);
	}

}
