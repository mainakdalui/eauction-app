#DockerImage - seller service
FROM openjdk:8-jdk-alpine
EXPOSE 8081
ADD ./target/eauction-seller.jar /usr/eauction-app/package/eauction-seller-1.0.0.jar
WORKDIR /usr/eauction-app/package
ENTRYPOINT ["java","-jar","eauction-seller-1.0.0.jar"]