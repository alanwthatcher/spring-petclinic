FROM eclipse-temurin:21-jdk-jammy
 
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw build
COPY target/*.jar ./

CMD ["java", "-jar", "*.jar"]
