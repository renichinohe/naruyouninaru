package r.irohasu.naruyouninaru.ddd_learning.back_side.api.authentication;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import r.irohasu.naruyouninaru.ddd_learning.back_side.domain.MailAddress;
import r.irohasu.naruyouninaru.ddd_learning.back_side.domain.Password;

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
