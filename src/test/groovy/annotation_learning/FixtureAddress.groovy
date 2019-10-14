package annotation_learning

import groovy.transform.ToString
import r.irohasu.naruyouninaru.annotation_learning.use_annotation.Address

@ToString
class FixtureAddress {
    def get() {
        new Address("東京")
    }
}
