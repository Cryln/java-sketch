package org.example

import org.example.util.JsonUtil
import org.example.zoo.Animal
import org.example.zoo.Dog
import spock.lang.Specification

/**
 * @author jiangmingjiang
 * @since 2023/9/15
 */
class AppTest2 extends Specification {
    def "Main"() {

        expect:
        print("hello")
    }

    def test0 () {
        given:
        def json = "{\n" +
                "  \"name\": \"dog\",\n" +
                "  \"enemy\": {\n" +
                "    \"tel\": \"123123\",\n" +
                "    \"name\": \"human\"\n" +
                "  }\n" +
                "}"
        when:
        def animal = JsonUtil.fromJsonString(json, Animal)
        then:
        animal.class == Dog
    }
}
