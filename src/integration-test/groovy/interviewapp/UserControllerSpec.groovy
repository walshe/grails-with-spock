package interviewapp

import grails.test.mixin.integration.Integration
import grails.transaction.*

import spock.lang.*
import geb.spock.*

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 *
 * See https://github.com/geb/geb-example-grails for examples
 *
 */
@Integration
@Rollback
class UserControllerSpec extends GebSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        when:"The home page is visited"
            go '/user'

        then:"The title is correct"
        	$('title').text() == "Welcome to Grails"
    }
}
