package r.irohasu.naruyouninaru;

import r.irohasu.naruyouninaru.anotation.Address;
import r.irohasu.naruyouninaru.anotation.User;
import r.irohasu.naruyouninaru.anotation.UserId;
import r.irohasu.naruyouninaru.anotation.UserName;

public class Main {
    public static void main(String args[]) {

        System.out.println(new User(new UserId("1"), new UserName("太郎"), new Address("東京")));
    }

    public void output() {
        new User(new UserId("1"), new UserName("太郎"), new Address("東京"));
    }
}
