FROM azul/zulu-openjdk:17
#qqqRUN apt-get update && apt-get install -y procps
EXPOSE 8080
EXPO

:SE 8010
ARG JAR_FILE=target/app-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", \
"-Dcom.sun.management.jmxremote", \
"-Dcom.sun.management.jmxremote.port=8010", \
"-Dcom.sun.management.jmxremote.local.only=false", \
"-Dcom.sun.management.jmxremote.authenticate=false", \
"-Dcom.sun.management.jmxremote.ssl=false", \
"-Xmx128m", \
"-jar", \
"/app.jar"]