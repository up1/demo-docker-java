FROM eclipse-temurin:23-jdk
WORKDIR /xyz
COPY . .
RUN ./mvnw clean package
EXPOSE 8080
CMD ["java", "-jar", "target/api.jar"]