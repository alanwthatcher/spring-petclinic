FROM eclipse-temurin:21-jdk-jammy
 
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src ./src
	
RUN ./mvnw package
	
CMD ["java", "-jar", "target/spring-petclinic-3.3.0-SNAPSHOT.jar"]
