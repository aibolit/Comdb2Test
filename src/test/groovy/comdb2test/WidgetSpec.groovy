package comdb2test

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class WidgetSpec extends Specification implements DomainUnitTest<Widget> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
