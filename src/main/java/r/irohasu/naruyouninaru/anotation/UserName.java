package r.irohasu.naruyouninaru.anotation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString(includeFieldNames = false)
public class UserName {
    @Getter
    public final String value;
}
