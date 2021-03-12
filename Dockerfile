FROM openjdk:8
#ADD target/user-0.0.1-SNAPSHOT.jar user-0.0.1-SNAPSHOT.jar
EXPOSE 8081

RUN mkdir  /app


COPY . /srv/app
WORKDIR /srv/app


ENTRYPOINT ["java","-jar","/srv/app/target/my-first-project-1.0.0-SNAPSHOT.jar"]