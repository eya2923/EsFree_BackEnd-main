# Utiliser une image Maven pour construire l'application
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Utiliser une image JDK pour exécuter l'application
FROM openjdk:17-jdk-slim
COPY --from=build /app/target/myapp.jar /usr/app/myapp.jar
WORKDIR /usr/app
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "myapp.jar"]