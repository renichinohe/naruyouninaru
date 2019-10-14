package r.irohasu.naruyouninaru.ddd_learning.back_side.domain;

import org.springframework.stereotype.Repository;
import r.irohasu.naruyouninaru.ddd_learning.back_side.api.authentication.AuthenticationRequest;

@Repository
public interface AuthenticationRepository {
    AuthenticationRequest refer(AuthenticationRequest request);
}
