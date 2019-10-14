package annotation_learning

import groovy.transform.ToString
import r.irohasu.naruyouninaru.annotation_learning.use_annotation.UserId

@ToString
class FixtureUserId {
    def get() {
        new UserId("1")
    }
}
