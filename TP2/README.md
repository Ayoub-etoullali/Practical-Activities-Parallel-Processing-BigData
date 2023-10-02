# Practical-Activities-Parallel-Processing-BigData

# Kafka Setup for Event-Driven Architecture

This repository provides a basic setup for Apache Kafka to implement an Event-Driven Architecture. It includes instructions for setting up Kafka, using Docker (optional), and developing services with Spring Cloud Streams.

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
- [Docker](https://docs.docker.com/get-docker/) (optional)

## Kafka Setup

### Option 1: Manual Setup

1. **Download Kafka:** Download Apache Kafka from the [official website](https://kafka.apache.org/downloads) and extract it.

2. **Start ZooKeeper:** Start ZooKeeper by running the following command in the Kafka directory:

   ```bash
   bin/zookeeper-server-start.sh config/zookeeper.properties

<kbd>Ayoub ETOULLALI</kbd>