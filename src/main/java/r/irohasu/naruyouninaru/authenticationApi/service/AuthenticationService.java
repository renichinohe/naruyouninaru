package r.irohasu.naruyouninaru.authenticationApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import r.irohasu.naruyouninaru.authenticationApi.api.AuthenticationRequest;
import r.irohasu.naruyouninaru.authenticationApi.domain.AuthenticationRepository;
import r.irohasu.naruyouninaru.authenticationApi.domain.AuthenticationStatus;

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
