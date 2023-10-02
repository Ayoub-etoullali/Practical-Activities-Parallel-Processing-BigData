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

2. **Start Docker Containers:** Run the following command to start Kafka and ZooKeeper containers:

   ```bash
   docker-compose up
   ```

3. **Test Kafka:** Use `kafka-console-producer` and `kafka-console-consumer` as described above to test Kafka.

## Developing Kafka Services

In this section, you can describe how to create Kafka producers, consumers, and stream processors using Spring Cloud Streams. Provide links to relevant documentation or code examples.

## Running the Services

Explain how to run the Kafka services you've developed, including any required configurations and dependencies.

## Contributing

If you would like to contribute to this project, please open an issue or create a pull request with your proposed changes.

## License

This project is licensed under the [MIT License](LICENSE).
```

Feel free to modify and expand this template to provide detailed instructions for your specific Kafka setup and services. You can add information about how to configure Kafka topics, Spring Boot applications, and any other relevant details.
<kbd>Ayoub ETOULLALI</kbd> 👨‍💻
