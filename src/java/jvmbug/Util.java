package jvmbug;

import javax.servlet.http.HttpServletRequest;

public class Util {
    public static int getInt(String name, HttpServletRequest request, boolean zeroIfBlank) {
    if (request != null) {
	try {
	    return Integer.parseInt("" + doNothing(request));
	} catch (NumberFormatException nfe) {
	}
    }
    return zeroIfBlank ? 0 : -1;
  }

  public static Object doNothing(Object obj) {
    return obj;
  }
}
