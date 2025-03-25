FROM openjdk:23-jdk

WORKDIR /app

COPY target/devops-0.0.1-SNAPSHOT.jar /app/devops.jar

ENV PORT=8080

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "devops.jar"]