# Event Driven Architecture

This repository provides a basic setup for Apache Kafka to implement an Event-Driven Architecture. It includes instructions for setting up Kafka, using Docker, and developing services with Spring Cloud Streams.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Kafka Setup](#kafka-setup)
  - [Option 1: Manual Setup](#option-1-manual-setup)
  - [Option 2: Docker Setup](#option-2-docker-setup)
- [Developing Kafka Services](#developing-kafka-services)
- [Running the Services](#running-the-services)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before getting started, make sure you have the following prerequisites installed:

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Kafka](https://kafka.apache.org/downloads)
- [Apache ZooKeeper](https://zookeeper.apache.org/)
- [Docker](https://docs.docker.com/get-docker/)

## Kafka Setup

### Option 1: Manual Setup

1. **Download Kafka:** Download Apache Kafka from the [official website](https://kafka.apache.org/downloads) and extract it.

2. **Start ZooKeeper:** Start ZooKeeper by running the following command in the Kafka directory:

   ```bash
   bin/zookeeper-server-start.sh config/zookeeper.properties
  ![image](https://github.com/Ayoub-etoullali/Practical-Activities-Parallel-Processing-BigData/assets/92756846/0bfc85f9-7b54-4e39-9246-ec83184049b9)

3. **Start Kafka Server:** Start the Kafka server with the following command:

   ```bash
   bin/kafka-server-start.sh config/server.properties
   ```
  ![image](https://github.com/Ayoub-etoullali/Practical-Activities-Parallel-Processing-BigData/assets/92756846/51e7b1b7-fd96-41d8-a77b-32718865919a)

5. **Test Kafka:** Use `kafka-console-producer.sh` and `kafka-console-consumer.sh` to test Kafka's functionality.

  ![image](https://github.com/Ayoub-etoullali/Practical-Activities-Parallel-Processing-BigData/assets/92756846/396de206-b1b5-436f-a7a7-a87d55a651e1)

### Option 2: Docker Setup

1. **Create `docker-compose.yml`:** Create a `docker-compose.yml` file based on the [Docker Compose example](https://developer.confluent.io/quickstart/kafka-docker/).

![image](https://github.com/Ayoub-etoullali/Practical-Activities-Parallel-Processing-BigData/assets/92756846/07d5907e-5121-45f3-af42-c2b91f077eab)

2. **Start Docker Containers:** Run the following command to start Kafka and ZooKeeper containers:

   ```bash
   docker-compose up -d
   ```
![image](https://github.com/Ayoub-etoullali/Practical-Activities-Parallel-Processing-BigData/assets/92756846/25c80ed3-0a29-4bb5-8112-b4dfba4a804c)

3. **Test Kafka:** Use `kafka-console-producer` and `kafka-console-consumer` as described above to test Kafka.

![image](https://github.com/Ayoub-etoullali/Practical-Activities-Parallel-Processing-BigData/assets/92756846/d0434549-76a0-4853-b926-cb6f8f042028)

## Developing Kafka Services

In this section, we describe how to create Kafka producers, consumers, and stream processors using Spring Cloud Streams.

1. Un Service Producer KAFKA via un Rest Controler

   ![image](https://github.com/Ayoub-etoullali/Practical-Activities-Parallel-Processing-BigData/assets/92756846/be82e73e-f81b-4cc7-a449-270e87fc7a71)

3. Un Service Consumer KAFKA

   ![image](https://github.com/Ayoub-etoullali/Practical-Activities-Parallel-Processing-BigData/assets/92756846/ae8092fa-adb1-43e0-80e6-82cb00a7a319)

5. Un Service Supplier KAFKA

   ![image](https://github.com/Ayoub-etoullali/Practical-Activities-Parallel-Processing-BigData/assets/92756846/5cec7638-82d0-4938-9beb-e2cd59ea3365)

7. Un Service de Data Analytics Real Time Stream Processing avec Kaflka Streams

   
9. Une application Web qui permet d'afficher les résultats du Stream Data Analytics en temps réel
   
## Running the Services
how to run the Kafka services you've developed, including any required configurations and dependencies :

![dependencies](https://github.com/Ayoub-etoullali/Practical-Activities-Parallel-Processing-BigData/assets/92756846/b34df68e-d8ef-47a1-b54c-89a36d046bbf)

## License

This project is licensed under the [MIT License](LICENSE).

<kbd>Ayoub ETOULLALI</kbd> 👨‍💻
