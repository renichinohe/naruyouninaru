package r.irohasu.naruyouninaru.authenticationApi.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class MailAddress {
    @Getter
    public final String value;
}
