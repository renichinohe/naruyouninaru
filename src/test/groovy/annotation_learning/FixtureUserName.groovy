package annotation_learning

import groovy.transform.ToString
import r.irohasu.naruyouninaru.annotation_learning.use_annotation.UserName

@ToString(includeFields = false)
class FixtureUserName {
    def get() {
        new UserName("太郎")
    }
}
