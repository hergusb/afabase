FROM java:8
COPY . .
RUN mvn install
CMD ["java", "-jar", "/target/pruebajpa-0.0.1-SNAPSHOT.jar"]
