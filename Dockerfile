FROM openjdk:8-jdk-alpine

VOLUME /tmp

#Expose Argument for setting MONGO_HOST

ARG MONGO_HOST=mongodev

ENV MONGO_HOST=${MONGO_HOST}

EXPOSE 8080

ARG JAR_FILE="target/mongodb-spring-0.0.1-SNAPSHOT.jar"

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]