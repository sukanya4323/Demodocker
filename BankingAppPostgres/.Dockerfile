FROM openjdk:11
ADD target/bankingapp.jar bankingapp.jar
ENTRYPOINT ["java", "-jar","bankingapp.jar"]
EXPOSE 8080