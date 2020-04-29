FROM openjdk:8u191-jdk-alpine3.9
ADD target/docker-luczniczqa-0.0.1-SNAPSHOT.jar .
EXPOSE 1505
CMD java -jar docker-luczniczqa-0.0.1-SNAPSHOT.jar