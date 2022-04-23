FROM openjdk:11-jre-slim-buster

WORKDIR spring-boot-docker-json-logging
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-docker-json-logging.jar

ENV SPRING_PROFILES_ACTIVE=docker

EXPOSE 8080

ENTRYPOINT ["java","-jar","spring-boot-docker-json-logging.jar"]
