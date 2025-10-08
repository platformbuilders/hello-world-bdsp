FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

COPY target/hello-java-0.0.1.jar app.jar

EXPOSE 8080
 
ENTRYPOINT ["java", "-jar", "app.jar"]
