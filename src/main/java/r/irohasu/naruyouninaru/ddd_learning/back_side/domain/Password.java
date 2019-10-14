package r.irohasu.naruyouninaru.ddd_learning.back_side.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class Password {
    @Getter
    public final String value;
}
