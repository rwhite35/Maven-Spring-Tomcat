### Spring Boot 3.3.2 Example

This project updates the initial Spring Framework 3.2.0 project to support 
OpenJDK v17.0.12, Gradle 8.9, and uses Spring APIs:
- `Thymeleaf` for view render engine
- `Boot-Starter-Web` for request routing
- `Boot-Starter-Validation` for form input validation

--
### About the Project

This project synthesizes three Spring Boot examples into one runnable app, incorporating the following guide topics: 
> [Quick Start](https://spring.io/quickstart)
> [REST Services](https://spring.io/guides/gs/rest-service)
> [Validate Form Input](https://spring.io/guides/gs/validating-form-input)

The remainder of this document is specific to setup for this project.

--
### PREREQUISITES

1. Spring Boot was initially using Springs web wizard interface. Its not necessary if cloning this project. But for reference, see [start.spring.io](start.spring.io).

2. MacOS using Homebrew was the build environment for this project. Spring is cross-platform and has complete setup for Linux and Windows environment [here](https://spring.io/projects/spring-boot).

3. MacOS installs with a system version of Java (usually JavaSE 1.8.x) which is not recommended for Java development projects unless specifically required. [Homebrew](https://brew.sh) is recommended but also not a hard requirement.

4. This project was created using VSCode IDE and imported most project extensions through that IDE's Extension Manager. Regardless, all Dependency Implementations are listed in the Grandle build files (build.gradle) and should automatically pull in any required dependencies regardless of the IDE used.


