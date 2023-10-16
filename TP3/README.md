# Projet de Gestion Bancaire avec Microservices

Ce projet est une application de gestion bancaire qui utilise une architecture à microservices pour gérer les clients et les comptes bancaires, avec un service de découverte, une passerelle et un service de configuration.

## Microservices

### 1. Customer Service

- Gère les clients de la banque.
- Fournit des opérations pour créer, consulter et modifier les clients.
- Communique avec la base de données pour stocker les informations des clients.

### 2. Account Service

- Gère les comptes bancaires.
- Propriétés d'un compte : identifiant, date de création, type (CURRENT_ACCOUNT ou SAVING_ACCOUNT), statut (CREATED, ACTIVATED, SUSPENDED, BLOCKED), client auquel le compte appartient.
- Fournit des opérations de création, consultation, modification, débit, crédit et transfert de montant.
- Enregistre l'historique des transactions pour chaque compte.

### 3. Discovery Service

- Utilise Eureka Server pour la découverte des microservices.
- Permet aux microservices de s'enregistrer et de découvrir les autres services disponibles dans le système.

### 4. Gateway Service

- Utilise Spring Cloud Gateway pour acheminer les requêtes vers les microservices appropriés en fonction des URI.
- Gère la sécurité, l'authentification, l'autorisation et d'autres aspects de la gestion des demandes.

### 5. Service de Configuration

- Gère les configurations de tous les microservices de manière centralisée.
- Utilise Spring Cloud Config Server pour la gestion centralisée des configurations.

## Configuration

- Vous devez configurer correctement les bases de données pour chaque microservice, ainsi que les paramètres de sécurité et d'authentification.
- Assurez-vous que les microservices s'enregistrent auprès du service Discovery (Eureka) et sont accessibles via la passerelle.

## Installation et Exécution

1. Clonez ce dépôt.

2. Configurez chaque microservice (Customer Service, Account Service) avec les détails de la base de données et d'autres configurations requises.

3. Démarrez le service Discovery (Eureka).

4. Démarrez la Gateway Service (Spring Cloud Gateway).

5. Déployez les microservices (Customer Service, Account Service).

6. Testez le système en effectuant des appels aux API exposées par les microservices via la passerelle.

## Contributions

Les contributions sont les bienvenues. N'hésitez pas à ouvrir des issues et à soumettre des pull requests.

## DEMO

## Auteur
<kbd>Ayoub ETOULLALI</kbd> 👨‍💻
