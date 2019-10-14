package annotation_learning

import groovy.transform.ToString
import r.irohasu.naruyouninaru.annotation_learning.use_annotation.Address
import r.irohasu.naruyouninaru.annotation_learning.use_annotation.User
import r.irohasu.naruyouninaru.annotation_learning.use_annotation.UserId
import r.irohasu.naruyouninaru.annotation_learning.use_annotation.UserName

@ToString(includeFields = false)
class FixtureUser {
    def static get() {
        new User(new UserId("1"), new UserName("太郎"), new Address("東京"))
    }
}
