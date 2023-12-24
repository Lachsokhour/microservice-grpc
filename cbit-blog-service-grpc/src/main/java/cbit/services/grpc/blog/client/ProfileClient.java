package cbit.services.grpc.blog.client;

import cbit.service.grpc.blog.model.BlogProto;
import cbit.service.grpc.blog.model.ProfilesServiceGrpc;
import com.google.protobuf.Int32Value;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProfileClient {
    private static final Logger LOG = LoggerFactory.getLogger(ProfileClient.class);

    @GrpcClient("profile-service-grpc")
    ProfilesServiceGrpc.ProfilesServiceBlockingStub stub;

    public BlogProto.Profiles getProfilesByBlogId(int blogId) {
        try {
            return stub.findByBlog(Int32Value.newBuilder().setValue(blogId).build());
        } catch (final StatusRuntimeException e) {
            LOG.error("Error in communication", e);
            return null;
        }
    }
}
