FROM amazoncorretto:8-alpine-jdk
MAINTAINER NOMBRE
COPY target/hcc-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]