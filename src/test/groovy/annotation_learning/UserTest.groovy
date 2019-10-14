package annotation_learning

import r.irohasu.naruyouninaru.annotation_learning.use_annotation.User
import r.irohasu.naruyouninaru.annotation_learning.unused_annotation.NormalUser
import spock.lang.Specification

class UserTest extends Specification {

    def test() {
        def save = System.out

        def printStream = Mock(PrintStream)
        System.out = printStream

        when:
        print User.createUser()
        print NormalUser.createNormalUser()

        then:
        2 * printStream.print("User(id=UserId(value=1), name=UserName(太郎), address=Address(東京))")

        cleanup:
        System.out = save
    }
}