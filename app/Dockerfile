FROM azul/zulu-openjdk:17
#RUN apt-get update && apt-get install -y procps
EXPOSE 8080
# JMX port
EXPOSE 8010
ARG JAR_FILE=target/app-1.0-SNAPSHOT.jar
ARG APPINSIGHT_AGENT=https://github.com/microsoft/ApplicationInsights-Java/releases/download/3.2.4/applicationinsights-agent-3.2.4.jar
ADD ${JAR_FILE} app.jar
ADD ${APPINSIGHT_AGENT} applicationinsights-agent.jar
ADD applicationinsights.json applicationinsights.json
ENTRYPOINT ["java", \
"-Dcom.sun.management.jmxremote", \
"-Dcom.sun.management.jmxremote.port=8010", \
"-Dcom.sun.management.jmxremote.local.only=false", \
"-Dcom.sun.management.jmxremote.authenticate=false", \
"-Dcom.sun.management.jmxremote.ssl=false", \
"-XX:MaxRAMPercentage=50.0",\
"-XX:+ExitOnOutOfMemoryError",\
"-XX:+PrintFlagsFinal",\
"-XX:+PrintCodeCache",\
"-verbose:gc",\
"-javaagent:/applicationinsights-agent.jar", \
"-jar", \
"/app.jar"]