package annotation_learning

import r.irohasu.naruyouninaru.annotation_learning.unused_annotation.NormalUser
import r.irohasu.naruyouninaru.annotation_learning.use_annotation.User
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
