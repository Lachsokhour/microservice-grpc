package cbit.services.grpc.blog.config;

import cbit.service.grpc.blog.model.BlogProto;
import cbit.services.grpc.blog.repository.BlogRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoConfig {
    @Bean
    BlogRepository repository() {
        List<BlogProto.Blog> blogs = new ArrayList<>();
        blogs.add(BlogProto.Blog.newBuilder().setId(1).setPesel("12345").setName("Adam Kowalski")
                .setType(BlogProto.Blog.BlogType.INDIVIDUAL).build());
        blogs.add(BlogProto.Blog.newBuilder().setId(2).setPesel("12346").setName("Anna Malinowska")
                .setType(BlogProto.Blog.BlogType.INDIVIDUAL).build());
        blogs.add(BlogProto.Blog.newBuilder().setId(3).setPesel("12347").setName("Paweł Michalski")
                .setType(BlogProto.Blog.BlogType.INDIVIDUAL).build());
        blogs.add(BlogProto.Blog.newBuilder().setId(4).setPesel("12348").setName("Karolina Lewandowska")
                .setType(BlogProto.Blog.BlogType.INDIVIDUAL).build());
        return new BlogRepository(blogs);
    }
}
