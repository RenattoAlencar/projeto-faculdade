FROM openjdk:17-jdk

WORKDIR /app

COPY target/*.jar /app/devops.jar

ENV PORT=8080

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/devops.jar"]
