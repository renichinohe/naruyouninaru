import r.irohasu.naruyouninaru.annotation.UserId
import groovy.transform.ToString

@ToString
class FixtureUserId {
    def get() {
        new UserId("1")
    }
}
