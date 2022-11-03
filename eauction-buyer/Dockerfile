#DockerImage - buyer service
FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD ./target/eauction-buyer.jar /usr/eauction-app/package/eauction-buyer-1.0.0.jar
WORKDIR /usr/eauction-app/package
ENTRYPOINT ["java","-jar","eauction-buyer-1.0.0.jar"]