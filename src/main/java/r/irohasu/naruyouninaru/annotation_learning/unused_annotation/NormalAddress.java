package r.irohasu.naruyouninaru.annotation_learning.unused_annotation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
public class NormalAddress {
    @Getter
    public final String value;

    public String toString() {
        return "Address(" + value + ")";
    }
}
