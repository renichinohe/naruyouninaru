import r.irohasu.naruyouninaru.annotation.User
import r.irohasu.naruyouninaru.normal.NormalUser
import spock.lang.Specification

class ToStringTest extends Specification {

    def test() {

        
        setup:
        String user = User.createUser().toString()
        String normalUser = NormalUser.createNormalUser().toString()
        String exp = "User(id=UserId(value=1), name=UserName(太郎), address=Address(東京))"

        expect:
        user == normalUser
        user == exp
        normalUser == exp

    }
}
