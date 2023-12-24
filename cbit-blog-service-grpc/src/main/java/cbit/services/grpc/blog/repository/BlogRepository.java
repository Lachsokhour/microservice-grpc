package cbit.services.grpc.blog.repository;

import cbit.service.grpc.blog.model.BlogProto;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BlogRepository {
    private final List<BlogProto.Blog> blogs;
    AtomicInteger id;

    public BlogRepository(List<BlogProto.Blog> blogs) {
        this.blogs = blogs;
        this.id = new AtomicInteger();
        this.id.set(blogs.size());
    }

    public BlogProto.Blog findById(int id) {
        return blogs.stream().filter(it -> it.getId() == id).findFirst().orElseThrow();
    }

    public BlogProto.Blog findByPesel(String pesel) {
        return blogs.stream().filter(it -> it.getPesel().equals(pesel)).findFirst().orElseThrow();
    }

    public List<BlogProto.Blog> findAll() {
        return blogs;
    }

    public BlogProto.Blog add(BlogProto.Blog.BlogType type, String name, String pesel) {
        return BlogProto.Blog.newBuilder()
                .setId(id.incrementAndGet())
                .setType(type)
                .setName(name)
                .setPesel(pesel)
                .build();
    }
}
