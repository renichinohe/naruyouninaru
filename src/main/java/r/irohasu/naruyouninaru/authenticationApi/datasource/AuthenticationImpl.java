package r.irohasu.naruyouninaru.authenticationApi.datasource;

import org.springframework.stereotype.Component;
import r.irohasu.naruyouninaru.authenticationApi.api.AuthenticationRequest;
import r.irohasu.naruyouninaru.authenticationApi.domain.AuthenticationRepository;
import r.irohasu.naruyouninaru.authenticationApi.domain.MailAddress;
import r.irohasu.naruyouninaru.authenticationApi.domain.Password;

@Component
public class AuthenticationImpl implements AuthenticationRepository {
    @Override
    public AuthenticationRequest refer(AuthenticationRequest request) {
        return new AuthenticationRequest(new MailAddress("sendai@irohasu.co.jp"), new Password("1234test"));
    }
}
