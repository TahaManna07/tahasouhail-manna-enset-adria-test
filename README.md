# Mon Projet de Microservices avec Eureka et Gateway

Ce projet utilise une architecture de microservices basée sur Spring Cloud, avec les services suivants :
- **Service de Bénéficiaires**
- **Service de Virements**
- **Service Eureka (Discovery Server)**
- **API Gateway**

## Architecture

L'architecture est composée de microservices interconnectés via Eureka pour la découverte de services et d'une API Gateway pour gérer les requêtes et les rediriger vers les services correspondants.

### Services et Endpoints

| Service               | URL d'accès                                 | Description                                 |
|-----------------------|---------------------------------------------|---------------------------------------------|
| Gateway               | `http://localhost:8888`                    | Gère les requêtes et les redirige vers les services appropriés. |
| Service Eureka        | `http://localhost:8761`                    | Interface Eureka pour visualiser les services enregistrés. |
| Service de Bénéficiaires | `http://localhost:8888/BENEFICIARY-SERVICE/api/beneficiaries` | Permet la gestion des bénéficiaires (ajout, liste, suppression, etc.). |
| Service de Virements  | `http://localhost:8888/VIREMENT-SERVICE/api/virements` | Permet la gestion des virements (création, liste, annulation, etc.). |

---

## Services en détail

### 1. Service de Bénéficiaires

Le service de Bénéficiaires permet la gestion des bénéficiaires bancaires.

- **Endpoint** : `http://localhost:8888/BENEFICIARY-SERVICE/api/beneficiaries`
- **Méthodes disponibles** :
  - `GET /api/beneficiaries` : Liste tous les bénéficiaires.
  - `POST /api/beneficiaries` : Ajoute un nouveau bénéficiaire.
  - `GET /api/beneficiaries/{id}` : Affiche les informations d’un bénéficiaire spécifique.
  - `DELETE /api/beneficiaries/{id}` : Supprime un bénéficiaire.

**Capture d'écran de l'interface des bénéficiaires :**

![benfe controller](https://github.com/user-attachments/assets/038e0910-0746-4e23-a3e6-ba05bf5bcb8d)


---

### 2. Service de Virements

Le service de Virements permet la gestion des virements bancaires.

- **Endpoint** : `http://localhost:8888/VIREMENT-SERVICE/api/virements`
- **Méthodes disponibles** :
  - `GET /api/virements` : Liste tous les virements.
  - `POST /api/virements` : Crée un nouveau virement.
  - `GET /api/virements/{id}` : Affiche les détails d’un virement spécifique.
  - `DELETE /api/virements/{id}` : Annule un virement.

**Capture d'écran de l'interface des virements :**

![Virements Endpoint Screenshot](![virmetn contorller](https://github.com/user-attachments/assets/62e3566e-4ce0-4198-98bd-2b1a180fbe1e))

---

### 3. Service Eureka

Le service Eureka est utilisé pour la découverte de services. Tous les services sont enregistrés dans Eureka, ce qui permet de les retrouver dynamiquement.

- **Interface Eureka** : `http://localhost:8761`

**Capture d'écran de l'interface Eureka :**

![Eureka Interface Screenshot](![All isntance with eureka](https://github.com/user-attachments/assets/c4a626b4-6d7f-455b-9d80-c6a3a9101495))

---

## API Gateway

L'API Gateway est utilisée pour centraliser les appels aux différents services. Toutes les requêtes passent par la gateway, qui redirige vers le service approprié.

- **URL de base** : `http://localhost:8888`

---

## Captures d'écran

Ajoutez les captures d'écran dans le dossier `screenshots` de votre projet, et utilisez les liens relatifs suivants :

- Bénéficiaires Endpoint : ![benefi ghateway](https://github.com/user-attachments/assets/5698c716-93a8-4828-9552-30f3ab5f4791)

- Virements Endpoint : ![virment gateway](https://github.com/user-attachments/assets/fbdc4e88-3a15-4650-80a3-d5c4e71d8009)


---

## Démarrage du Projet

1. Clonez le projet depuis le dépôt Git.
2. Démarrez chaque service individuellement en utilisant les commandes suivantes :
   ```bash
   mvn spring-boot:run -Dspring-boot.run.profiles=[nom_du_service]
