package r.irohasu.naruyouninaru.ddd_learning.back_side.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import r.irohasu.naruyouninaru.ddd_learning.back_side.api.authentication.AuthenticationRequest;
import r.irohasu.naruyouninaru.ddd_learning.back_side.domain.AuthenticationRepository;
import r.irohasu.naruyouninaru.ddd_learning.back_side.domain.AuthenticationStatus;

@Component
public class AuthenticationService {

    @Autowired
    AuthenticationRepository authenticationRepository;

    public AuthenticationStatus check(AuthenticationRequest request) {
        if (request.getMailAddress().equals(authenticationRepository.refer(request).getMailAddress())) {
            return AuthenticationStatus.ok;
        }
        return AuthenticationStatus.ng;
    }
}
