# Use the official OpenJDK 17 image as base
FROM openjdk:17

# Create and set the working directory
WORKDIR /usr/app

# Copy the built JAR file into the image (adjust the file name as needed)
COPY ./target/Hospital-0.0.1-SNAPSHOT.jar app.jar

# Expose port (optional, e.g., for Spring Boot web apps)
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]