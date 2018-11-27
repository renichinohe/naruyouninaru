package r.irohasu.naruyouninaru.anotation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class UserId {
    @Getter
    public final String value;
}
