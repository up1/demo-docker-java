FROM eclipse-temurin:23-jdk AS step01
WORKDIR /xyz
COPY . .
EXPOSE 8888
RUN --mount=type=cache,target=/root/.m2 ./mvnw clean package

FROM eclipse-temurin:23-jre-alpine
WORKDIR /build
COPY --from=step01 /xyz/target/api.jar .
EXPOSE 8080
CMD ["java", "-jar", "api.jar"]