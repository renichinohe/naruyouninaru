package r.irohasu.naruyouninaru.normal;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
public class NormalUserId {
    @Getter
    public final String value;

    public String toString() {
        return "UserId(value=" + value + ")";
    }
}
