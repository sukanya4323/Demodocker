FROM openjdk:11-jdk-alpine

ADD target/dockerDemo-0.0.1-SNAPSHOT.jar dockerDemo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar","dockerDemo-0.0.1-SNAPSHOT.jar"]