FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/root/.m2/repository/com/cb/covid/Covid19_Infected_Cases/0.0.1-SNAPSHOT/Covid19_Infected_Cases-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
