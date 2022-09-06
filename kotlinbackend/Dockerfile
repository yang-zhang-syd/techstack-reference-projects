FROM maven:3-amazoncorretto-17 AS build
COPY . /home/maven/src
WORKDIR /home/maven/src
RUN mvn package
RUN ls ./target

FROM amazoncorretto:17
EXPOSE 8080:8080
RUN mkdir /app
COPY --from=build /home/maven/src/target/*.jar /app/kotlinbackend.jar
ENTRYPOINT ["java","-jar","/app/kotlinbackend.jar"]