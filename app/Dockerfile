FROM openjdk:17-jdk-alpine
EXPOSE 8080
EXPOSE 8010
ARG JAR_FILE=target/app-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", \
"-Dcom.sun.management.jmxremote", \
"-Dcom.sun.management.jmxremote.port=8010", \
"-Dcom.sun.management.jmxremote.local.only=false", \
"-Dcom.sun.management.jmxremote.authenticate=false", \
"-Dcom.sun.management.jmxremote.ssl=false", \
"-jar", \
"/app.jar"]