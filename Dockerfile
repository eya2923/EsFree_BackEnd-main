FROM openjdk:17-jdk-alpine

# Expose le port de l'application Spring Boot
EXPOSE 8081
# Ajoute le livrable Spring Boot dans l'image
ADD target/Projet_virtiverse-0.0.1-SNAPSHOT.jar Projet_virtiverse-0.0.1-SNAPSHOT.jar

# Commande d'exécution de l'application Spring Boot
ENTRYPOINT ["java", "-jar", "/Projet_virtiverse-0.0.1-SNAPSHOT.jar"]