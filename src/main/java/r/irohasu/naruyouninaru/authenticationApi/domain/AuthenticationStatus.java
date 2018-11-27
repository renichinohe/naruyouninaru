package r.irohasu.naruyouninaru.authenticationApi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString(includeFieldNames = false)
public enum AuthenticationStatus {
    ok("認証成功"),
    ng("認証失敗");

    @Getter
    private final String value;
}
