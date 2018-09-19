FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/squash-fabulous-api.jar
ADD ${JAR_FILE} squash-fabulous-api.jar
CMD java -jar squash-fabulous-api.jar