FROM alpine/java:21-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} SpringBootLog4J2Slf4j.jar
ENTRYPOINT ["java","-jar","/SpringBootLog4J2Slf4j.jar"]