package cbit.services.grpc.profile.service;

import cbit.services.grpc.profile.model.ProfileProto;
import cbit.services.grpc.profile.model.ProfilesServiceGrpc;
import cbit.services.grpc.profile.repository.ProfileRepository;
import com.google.protobuf.Empty;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import io.grpc.stub.StreamObserver;
import java.util.List;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ProfileService extends ProfilesServiceGrpc.ProfilesServiceImplBase {
    private final ProfileRepository repository;

    public ProfileService(ProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public void findByNumber(StringValue request, StreamObserver<ProfileProto.Profile> responseObserver) {
        var profile = repository.findByNumber(request.getValue());
        responseObserver.onNext(profile);
        responseObserver.onCompleted();
    }

    @Override
    public void findByCustomer(Int32Value request, StreamObserver<ProfileProto.Profiles> responseObserver) {
        var profiles = repository.findByCustomer(request.getValue());
        var state = ProfileProto.Profiles.newBuilder().addAllProfile(profiles).build();
        responseObserver.onNext(state);
        responseObserver.onCompleted();
    }

    @Override
    public void findAll(Empty request, StreamObserver<ProfileProto.Profiles> responseObserver) {
        var profiles = repository.findAll();
        var data = ProfileProto.Profiles.newBuilder().addAllProfile(profiles).build();
        responseObserver.onNext(data);
        responseObserver.onCompleted();
    }

    @Override
    public void addProfile(ProfileProto.Profile request, StreamObserver<ProfileProto.Profile> responseObserver) {
        var profile = repository.add(request.getCustomerId(), request.getNumber());
        responseObserver.onNext(profile);
        responseObserver.onCompleted();
    }
}
