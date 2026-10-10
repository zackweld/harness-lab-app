# The Harness pipeline builds the jar first (mvn package); this image just runs it.
# eclipse-temurin publishes arm64 and amd64 variants, so it works on Apple Silicon.
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/lab-app.jar /app/lab-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/lab-app.jar"]
