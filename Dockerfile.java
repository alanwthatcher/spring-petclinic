FROM eclipse-temurin:21-jdk-jammy
 
WORKDIR /app

RUN ./mvnw build
COPY target/*.jar ./

CMD ["java", "-jar", "*.jar"]
