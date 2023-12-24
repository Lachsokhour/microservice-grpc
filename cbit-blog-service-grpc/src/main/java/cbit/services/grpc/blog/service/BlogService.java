package cbit.services.grpc.blog.service;

import cbit.service.grpc.blog.model.BlogProto;
import cbit.service.grpc.blog.model.BlogsServiceGrpc;
import cbit.services.grpc.blog.client.ProfileClient;
import cbit.services.grpc.blog.repository.BlogRepository;
import com.google.protobuf.Empty;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import io.grpc.stub.StreamObserver;
import java.util.List;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class BlogService extends BlogsServiceGrpc.BlogsServiceImplBase {
    private final BlogRepository repository;
    private final ProfileClient profileClient;

    public BlogService(BlogRepository repository, ProfileClient profileClient) {
        this.repository = repository;
        this.profileClient = profileClient;
    }

    @Override
    public void findById(Int32Value request, StreamObserver<BlogProto.Blog> responseObserver) {
        BlogProto.Blog c = repository.findById(request.getValue());
        BlogProto.Profiles a = profileClient.getProfilesByBlogId(c.getId());
        List<BlogProto.Profile> l = a.getProfileList();
        c = BlogProto.Blog.newBuilder(c).addAllProfiles(l).build();
        responseObserver.onNext(c);
        responseObserver.onCompleted();
    }

    @Override
    public void findByPesel(StringValue request, StreamObserver<BlogProto.Blog> responseObserver) {
        BlogProto.Blog c = repository.findByPesel(request.getValue());
        responseObserver.onNext(c);
        responseObserver.onCompleted();
    }

    @Override
    public void findAll(Empty request, StreamObserver<BlogProto.Blogs> responseObserver) {
        List<BlogProto.Blog> blogList = repository.findAll();
        BlogProto.Blogs c = BlogProto.Blogs.newBuilder().addAllBlogs(blogList).build();
        responseObserver.onNext(c);
        responseObserver.onCompleted();
    }

    @Override
    public void addBlog(BlogProto.Blog request, StreamObserver<BlogProto.Blog> responseObserver) {
        BlogProto.Blog c = repository.add(request.getType(), request.getName(), request.getPesel());
        responseObserver.onNext(c);
        responseObserver.onCompleted();
    }
}
