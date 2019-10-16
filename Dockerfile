FROM java:8
COPY /target/pruebajpa-0.0.1-SNAPSHOT.jar /pruebajpa.jar
CMD ["java", "-jar", "/pruebajpa.jar"]
