package r.irohasu.naruyouninaru.annotation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    @Getter
    private final UserId id;
    @Getter
    private final UserName name;
    @Getter
    private final Address address;

    public static User createUser() {
        return new User(new UserId("1"), new UserName("太郎"), new Address("東京"));
    }
}
