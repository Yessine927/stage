# Use official Java runtime as parent image
FROM openjdk:17-jdk-alpine

# Set working directory
WORKDIR /app

# Add a volume pointing to /tmp (optional)
VOLUME /tmp

# Copy the built jar file into the container
COPY target/TaskManager-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app uses
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
