import r.irohasu.naruyouninaru.annotation.Address
import r.irohasu.naruyouninaru.annotation.User
import r.irohasu.naruyouninaru.annotation.UserId
import r.irohasu.naruyouninaru.annotation.UserName
import groovy.transform.ToString

@ToString(includeFields = false)
class FixtureUser {
    def static get() {
        new User(new UserId("1"), new UserName("太郎"), new Address("東京"))
    }
}
