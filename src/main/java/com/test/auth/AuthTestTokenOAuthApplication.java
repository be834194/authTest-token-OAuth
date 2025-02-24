package com.test.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.test.auth.config.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
//@ConfigurationProperties付きBeanをDIコンテナに登録する
public class AuthTestTokenOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthTestTokenOAuthApplication.class, args);
	}

}
