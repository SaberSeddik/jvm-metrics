FROM openjdk:17-jdk-alpine
EXPOSE 7070
ARG JAR_FILE=target/spring-boot-admin-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} spring-boot-admin.jar
ENTRYPOINT ["java","-jar","/spring-boot-admin.jar"]