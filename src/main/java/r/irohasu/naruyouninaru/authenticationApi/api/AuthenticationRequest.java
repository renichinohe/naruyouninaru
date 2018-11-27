package r.irohasu.naruyouninaru.authenticationApi.api;

import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class AuthenticationRequestForms {
    @Getter
    private final String mailAddress;

    @Getter
    private final String password;
}
