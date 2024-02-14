# Projet Gestion de Courses

Ce projet est une application Spring Boot pour la gestion du cycle de vie des courses et de leurs partants, basée sur une architecture événementielle avec Apache Kafka.

## Technologies utilisées

- Java 8
- Spring Boot
- MySQL
- Apache Kafka

## Configuration requise

Assurez-vous d'avoir installé les éléments suivants :

- Java JDK 8 ou supérieur
- Apache Maven
- MySQL
- Apache Kafka

## Installation et exécution

1. Cloner le repository : git clone https://github.com/votre-utilisateur/votre-projet.git


2. Configurer la base de données :

   - AInstallation de MySQL.
   - Créez une base de données nommée `courses`.
   - Configurez les paramètres de connexion à la base de données dans le fichier `src/main/resources/application.properties`.

3. Démarrer Apache Kafka :

   - Assurez-vous que Kafka est installé et en cours d'exécution sur votre machine.
   - Suivez les étapes pour démarrer Zookeeper et les brokers Kafka comme indiqué dans la documentation de Kafka.

4. Construire et exécuter l'application :
cd votre-projet
mvn spring-boot:run



L'application devrait maintenant être accessible à l'adresse `http://localhost:8080`.

## Fonctionnalités

- Création de courses avec leurs partants
- Stockage des informations dans une base de données MySQL
- Publication des événements de création de courses sur Apache Kafka
- Validation des données
- Tests unitaires et tests d'intégration
