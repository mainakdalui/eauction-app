# FSE3 use-case development - Rest APIs
## JAVA version
https://www.oracle.com/webapps/redirect/signon?nexturl=https://download.oracle.com/otn/java/jdk/8u341-b10/424b9da4b48848379167015dcc250d8d/jdk-8u341-windows-x64.exe

## Eclipse version
https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2019-12/R/eclipse-jee-2019-12-R-win32-x86_64.zip

## Redis version
https://github.com/microsoftarchive/redis/releases/tag/win-3.2.100

## Apache Kafka version
https://dlcdn.apache.org/kafka/3.2.1/kafka_2.13-3.2.1.tgz

## Apache Kafka start commands
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties

## Apache Kafka commands for topic
.\bin\windows\kafka-topics.bat --create --topic quickstart-events --bootstrap-server localhost:9092
.\bin\windows\kafka-topics.bat --describe --topic quickstart-events --bootstrap-server localhost:9092

## Apache Kafka commands for producer/consumer
.\bin\windows\kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092
.\bin\windows\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092

## Apache Kafka commands for topic eauction.bid
.\bin\windows\kafka-topics.bat --describe --topic eauction.bid --bootstrap-server localhost:9092
.\bin\windows\kafka-console-consumer.bat --topic eauction.bid --from-beginning --bootstrap-server localhost:9092

## Docker image build
docker build -t mainakdalui/buyer-svc-imgdock .
docker build -t mainakdalui/seller-svc-imgdock .

## Docker run
docker run -p 8082:8082 --name buyer-svc-condock mainakdalui/buyer-svc-imgdock
docker run -p 8081:8081 --name seller-svc-condock mainakdalui/seller-svc-imgdock
