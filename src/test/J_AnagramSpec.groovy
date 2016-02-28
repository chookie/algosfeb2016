import spock.lang.Specification
import spock.lang.Unroll


/**
 * Test if anagram of word based on letters only, not words and case insensitive.
 */
class J_AnagramSpec extends Specification {

    @SuppressWarnings("GroovyPointlessBoolean")
    @Unroll
    def'#anagram rotis anagram of #word returns #result'(){

        expect:
        J_Anagram.methodOne(word,anagram) == result

        where:
        word            |  anagram          || result
        'word'          |  'wrdo'           || true
        'mary'          |  'army'           || true
        'mary'          |  'Army'           || true
        'stop'          |  'tops'           || true
        'boat'          |  'btoa'           || true
        'a'             |  'a'              || true
        'fill'          |  'fil'            || false
        'b'             |  'pure'           || false
        'ccc'           |  'ccccccc'        || false
        'sleep'         |  'slep'           || false
    }
}