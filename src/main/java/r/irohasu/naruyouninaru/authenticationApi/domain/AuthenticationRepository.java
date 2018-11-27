package r.irohasu.naruyouninaru.authenticationApi.domain;

import org.springframework.stereotype.Repository;
import r.irohasu.naruyouninaru.authenticationApi.api.AuthenticationRequest;

@Repository
public interface AuthenticationRepository {
    AuthenticationRequest refer(AuthenticationRequest request);
}
