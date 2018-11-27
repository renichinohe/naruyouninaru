package r.irohasu.naruyouninaru.authenticationApi.api;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import r.irohasu.naruyouninaru.authenticationApi.domain.MailAddress;
import r.irohasu.naruyouninaru.authenticationApi.domain.Password;

@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class AuthenticationRequest {
    @Getter
    @Setter
    public final MailAddress mailAddress;

    @Getter
    @Setter
    public final Password password;

    public AuthenticationRequest create() {
        return new AuthenticationRequest(
                new MailAddress(mailAddress.getValue()),
                new Password(password.getValue())
        );
    }
}
