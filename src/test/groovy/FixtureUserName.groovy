import r.irohasu.naruyouninaru.annotation.UserName
import groovy.transform.ToString

@ToString(includeFields = false)
class FixtureUserName {
    def get() {
        new UserName("太郎")
    }
}
