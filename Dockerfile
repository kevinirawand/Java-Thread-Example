FROM openjdk:23

WORKDIR /app

COPY out/app.jar .

CMD ["java", "-cp", "app.jar", "org.example.Main"]