package r.irohasu.naruyouninaru.annotation_learning.unused_annotation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
public class NormalUser {
    @Getter
    private final NormalUserId normalUserId;
    @Getter
    private final NormalUserName normalUserName;
    @Getter
    private final NormalAddress normalAddress;

    public String toString() {
        return "User(" + "id=" + normalUserId + ", name=" + normalUserName + ", address=" + normalAddress + ')';
    }

    public static NormalUser createNormalUser() {
        return new NormalUser(new NormalUserId("1"), new NormalUserName("太郎"), new NormalAddress("東京"));
    }
}
