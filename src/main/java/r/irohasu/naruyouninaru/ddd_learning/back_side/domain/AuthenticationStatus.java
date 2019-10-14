package r.irohasu.naruyouninaru.ddd_learning.back_side.domain;

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
