# jvmbug

To reproduce the seg fault on jdk 1.8:

1. Install jdk 1.8.0_60.
2. Set JAVA_HOME to jdk 1.8.0_60 directory.
3. git clone this repository.
4. cd into the base directory of the cloned repository
5. run ./grailsw test-app (Linux) or ./grails.bat test-app (Windows)

grails should execute the spock test named CrashSpec which will cause the jvm to seg fault.

This app was created by simply running 'grails create-app' to create a new application and then adding the 2 very simple files: CrashSpec.groovy and Util.java.  I have tried pulling Crashspec.groovy and Util.java out into a standalone project, but I was unable to reproduce the bug this way.
