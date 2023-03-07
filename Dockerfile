FROM openjdk:17-alpine

RUN apk update && apk upgrade

WORKDIR /app
COPY target/*.jar app.jar

ENV APP_MARKER=test-app

ARG VERSION_ID

LABEL app.version=${VERSION_ID}

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]