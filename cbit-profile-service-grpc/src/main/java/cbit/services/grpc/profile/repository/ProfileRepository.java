package cbit.services.grpc.profile.repository;

import cbit.services.grpc.profile.model.ProfileProto;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ProfileRepository {
    List<ProfileProto.Profile> Profiles;
    AtomicInteger id;

    public ProfileRepository(List<ProfileProto.Profile> Profiles) {
        this.Profiles = Profiles;
        this.id = new AtomicInteger();
        this.id.set(Profiles.size());
    }

    public List<ProfileProto.Profile> findAll() {
        return Profiles;
    }

    public List<ProfileProto.Profile> findByCustomer(int customerId) {
        return Profiles.stream().filter(it -> it.getCustomerId() == customerId).toList();
    }

    public ProfileProto.Profile findByNumber(String number) {
        return Profiles.stream()
                .filter(it -> it.getNumber().equals(number))
                .findFirst()
                .orElseThrow();
    }

    public ProfileProto.Profile add(int customerId, String number) {
        ProfileProto.Profile a = ProfileProto.Profile.newBuilder()
                .setId(id.incrementAndGet())
                .setCustomerId(customerId)
                .setNumber(number)
                .build();
        return a;
    }


}
