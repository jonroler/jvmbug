package jvmbug

import javax.servlet.http.HttpServletRequest
import spock.lang.Specification

public class CrashSpec extends Specification {
  def "make it crash"() {
    when:
    HttpServletRequest request = null
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
      Util.getInt("crash", request, true)
    }

    then:
    1 == 1
  }
}