FROM java:8
COPY target/*.jar /usr/src/mustache-demo/
WORKDIR /usr/src/mustache-demo/
CMD ["java", "-jar", "mustache-demo-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080

