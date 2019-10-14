package r.irohasu.naruyouninaru.annotation_learning.use_annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString(includeFieldNames = false)
public class UserName {
    @Getter
    public final String value;
}
