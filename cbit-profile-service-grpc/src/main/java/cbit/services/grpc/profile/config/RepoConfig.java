package cbit.services.grpc.profile.config;

import cbit.services.grpc.profile.model.ProfileProto;
import cbit.services.grpc.profile.repository.ProfileRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoConfig {
    @Bean
    ProfileRepository repository() {
        List<ProfileProto.Profile> profiles = new ArrayList<>();
        profiles.add(ProfileProto.Profile.newBuilder().setId(1).setCustomerId(1).setNumber("111111").build());
        profiles.add(ProfileProto.Profile.newBuilder().setId(2).setCustomerId(2).setNumber("222222").build());
        profiles.add(ProfileProto.Profile.newBuilder().setId(3).setCustomerId(3).setNumber("333333").build());
        profiles.add(ProfileProto.Profile.newBuilder().setId(4).setCustomerId(4).setNumber("444444").build());
        profiles.add(ProfileProto.Profile.newBuilder().setId(5).setCustomerId(1).setNumber("555555").build());
        profiles.add(ProfileProto.Profile.newBuilder().setId(6).setCustomerId(2).setNumber("666666").build());
        profiles.add(ProfileProto.Profile.newBuilder().setId(7).setCustomerId(2).setNumber("777777").build());
        return new ProfileRepository(profiles);
    }
}
