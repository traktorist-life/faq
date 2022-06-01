FROM gradle:7.4.2-jdk11 AS build

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle installDist  --no-daemon

FROM openjdk:11-jre-slim-buster
ENV APPLICATION_USER ktor
ENV PORT 8080

RUN adduser --system $APPLICATION_USER
RUN mkdir /app
RUN chown -R $APPLICATION_USER /app

USER $APPLICATION_USER

COPY --from=build /home/gradle/src/build/install/faq/ /app/

WORKDIR /app/bin
EXPOSE $PORT

CMD ["./faq"]