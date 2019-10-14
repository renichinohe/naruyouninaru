package r.irohasu.naruyouninaru.annotation_learning.use_annotation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class Address {
    @Getter
    public final String value;
}
