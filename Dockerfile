FROM openjdk
copy target/*.jar /app.jar
CMD ["/usr/bin/java", "-jar", "/app.jar"]