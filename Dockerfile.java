FROM eclipse-temurin:21-jdk-jammy
 
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src ./src
	
RUN ./mvnw package
	
COPY target/*.jar ./

CMD ["java", "-jar", "*.jar"]
