# Architecture de Microservices avec Spring Cloud

Ce dépôt contient une mise en œuvre d'une architecture de microservices avec Spring Cloud, développée dans le cadre de l'activité pratique. Vous trouverez ci-dessous des instructions pour configurer, exécuter et explorer les différents composants de l'architecture.

## Table des matières

- [Prérequis](#prérequis)
- [Description du Projet](#description-du-projet)
- [Vidéos de Formation](#vidéos-de-formation)
- [Configuration et Exécution](#configuration-et-exécution)
- [Création du Client Angular](#création-du-client-angular)
- [Contributions](#contributions)
- [Licence](#licence)

## Prérequis

Avant de commencer, assurez-vous d'avoir les éléments suivants installés sur votre machine :

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Node.js](https://nodejs.org/en/download/)
- [Angular CLI](https://cli.angular.io/)
- [Docker](https://docs.docker.com/get-docker/) (optionnel)

## Description du Projet

Ce projet implémente une architecture de microservices à l'aide de Spring Cloud. Il comprend plusieurs services, un service de passerelle Spring Cloud Gateway, la découverte de services avec Eureka, et un service de facturation intégré à l'aide de OpenFeign. L'objectif est de comprendre comment développer et déployer une architecture de microservices moderne.

## Vidéos de Formation

Pour vous aider à comprendre chaque étape de l'activité, nous avons enregistré des vidéos qui détaillent chaque partie du projet :

- [Première Partie : Customer-Service, Inventory-Service, Spring Cloud Gateway, Eureka Discovery](https://www.youtube.com/watch?v=IhNxrE5tlXs)
- [Deuxième Partie : Billing Service avec OpenFeign Rest Client](https://www.youtube.com/watch?v=jGvkVGCUf-w)
- [Troisième Partie : Créer un Client Angular](https://www.youtube.com/watch?v=iMCjDRUXoeM)

Nous vous recommandons de regarder ces vidéos pour une meilleure compréhension de l'activité.

## Configuration et Exécution

Suivez ces étapes pour configurer et exécuter les composants de l'architecture :

- **Configuration des services :** Consultez le code source de chaque service pour comprendre les configurations nécessaires.

- **Construction et exécution des services :** Utilisez Maven pour construire et exécuter chaque service individuellement.

- **Exécution avec Docker (optionnel) :** Si vous préférez, utilisez Docker pour exécuter les services et simplifier le déploiement.

- **Démarrage de Spring Cloud Gateway et Eureka :** Assurez-vous de démarrer la passerelle Spring Cloud Gateway et le service de découverte Eureka pour gérer les requêtes et la découverte de services.

## Création du Client Angular

Suivez les instructions de la vidéo pour créer un client Angular qui interagit avec les microservices. Vous découvrirez comment développer une interface utilisateur moderne pour votre architecture de microservices.

## Contributions

Si vous souhaitez contribuer à ce projet, n'hésitez pas à ouvrir une issue ou à créer une pull request avec vos modifications proposées.

## Licence

Ce projet est sous licence [MIT License](LICENSE). Veillez à respecter toutes les conditions de la licence lors de l'utilisation ou de la distribution du code.
