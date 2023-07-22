package com.koleff.coursePractise.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonPlaceHolderClientConfig {

    @Bean("jsonplaceholder")
    CommandLineRunner runner(JsonPlaceHolderClient
                                     jsonPlaceHolderClient) {
        return args -> {
            System.out.println(
                    "https://jsonplaceholder.typicode.com/posts");
            System.out.println(
                    jsonPlaceHolderClient.getPosts().size());

            System.out.println(
                    "https://jsonplaceholder.typicode.com/posts/7");
            System.out.println(jsonPlaceHolderClient.getPost(7));
        };
    }
}
