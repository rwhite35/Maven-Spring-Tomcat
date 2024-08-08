### Spring Boot 3.3.2 Example

This project updates the initial v1.0 - Spring Framework(3.2.0) project to support 
OpenJDK v17.0.12, Gradle v8.9, Tomcat v10.1, and using Spring 3.3.x APIs:
- `Thymeleaf` for view render engine
- `Boot-Starter-Web` for request routing
- `Boot-Starter-Validation` for form input validation

--
### About the Project

This project synthesizes three Spring Boot examples into one runnable app. See the following guide topics for example documentation: 
> [Quick Start](https://spring.io/quickstart)
> [REST Services](https://spring.io/guides/gs/rest-service)
> [Validate Form Input](https://spring.io/guides/gs/validating-form-input)

The remainder of this document is specific to setup for this project.

--
### SETUP & PREREQUISITES

1. `Spring Boot` web interface was used to initially create this project but is not necessary if cloned from repo. For setup wizard reference see [start.spring.io](start.spring.io).

2. The development environment is MacOS (Sonoma), and used [Homebrew](https://brew.sh) for `OpenJDK`, `Gradle`, and `Tomcat` package management. MacOS ships with Java (JavaSE 1.8) but that is mainly for System purposes and not recommended for general development purpose.  `Spring Framework` is cross-platform compatible and the project can build/run on either Linux or Windows. 

3. If using MacOS/Homebrew, the JAVA_HOME path should be something like:

- `/usr/local/Cellar/openjdk@17/17.0.12/libexec/openjdk.jdk/Contents/Home`

4. If multiple Java SDKs are installed, and `java_home` utility is available use that to target a specific SDK:

- `export JAVA_HOME=/usr/libexec/java_home -v 17`

where the number value is the target version used for Java.

5. This project was created using VSCode IDE which most project libraries and extensions through its Extension Manager. Regardless, all `Dependency Implementations` are listed in the Grandle build (build.gradle) file and should automatically pull in any required dependencies regardless of the IDE used.


--
### Build/Run in Debug Mode

To compile and test this application, ensure Debug Mode is enabled in the IDE preferences and select the class DemoApplication.java (main) to compile and run in debug mode.
The debugger should launch Tomcat with localhost:8080 (or whatever target port) which will display index.html.

![Index at src/main/java/resources/templates/index.html](https://github.com/rwhite35/Maven-Spring-Tomcat/screens/index.png)

Click the `here` link to present a form with one required input field as String of characters having a size 2 to 30 characters in length. NOTE: error handling not included in this project - couldn't do it all for yeah, right?.

![Index at src/main/java/resources/templates/form.html](https://github.com/rwhite35/Maven-Spring-Tomcat/screens/greetingF1.png)

![Index at src/main/java/resources/templates/greeting.html](https://github.com/rwhite35/Maven-Spring-Tomcat/screens/greetingF2.png)

Finally, on entering valid text, clicking submit will present a new view with a the submitted String as the new name to use.

![Index at src/main/java/resources/templates/result.html](https://github.com/rwhite35/Maven-Spring-Tomcat/screens/result.png)

Enjoy!

