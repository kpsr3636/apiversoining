package com.example.weather.demo.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSLambdaConfig {

    @Bean
    public AWSLambda awsLambda() {
        BasicAWSCredentials awsCredentials = new BasicAWSCredentials("your-access-key", "your-secret-key");
        return AWSLambdaClientBuilder.standard()
                .withRegion(Regions.US_EAST_1) // Set your region
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
