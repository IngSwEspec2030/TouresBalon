FROM mcr.microsoft.com/java/jre:11-zulu-alpine

WORKDIR /app

COPY target/*.jar ./app.jar

#ENV PATH=/app/app.jar

CMD ["java", "-jar", "app.jar"]