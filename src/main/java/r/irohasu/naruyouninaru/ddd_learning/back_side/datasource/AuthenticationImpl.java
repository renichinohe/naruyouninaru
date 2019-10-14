package r.irohasu.naruyouninaru.ddd_learning.back_side.datasource;

import org.springframework.stereotype.Component;
import r.irohasu.naruyouninaru.ddd_learning.back_side.api.authentication.AuthenticationRequest;
import r.irohasu.naruyouninaru.ddd_learning.back_side.domain.AuthenticationRepository;
import r.irohasu.naruyouninaru.ddd_learning.back_side.domain.MailAddress;
import r.irohasu.naruyouninaru.ddd_learning.back_side.domain.Password;

@Component
public class AuthenticationImpl implements AuthenticationRepository {
    @Override
    public AuthenticationRequest refer(AuthenticationRequest request) {
        return new AuthenticationRequest(new MailAddress("sendai@irohasu.co.jp"), new Password("1234test"));
    }
}
