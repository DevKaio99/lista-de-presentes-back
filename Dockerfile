# 1. Base image com Java
FROM openjdk:21-jdk-slim

# 2. Diretório dentro do container
WORKDIR /app

# 3. Copiar o JAR gerado pelo Maven
COPY target/lista-de-presentes-0.0.1-SNAPSHOT.jar app.jar

# 4. Expõe a porta que o Spring Boot usa
EXPOSE 8080

# 5. Comando para rodar o backend
ENTRYPOINT ["java","-jar","app.jar"]
