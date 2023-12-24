package cbit.services.grpc.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BlogRgpcApp {
    public static void main(String[] args) {
        SpringApplication.run(BlogRgpcApp.class, args);
    }
}
