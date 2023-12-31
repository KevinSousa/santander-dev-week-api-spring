# Santander Dev Week 2023

Java RESTful API criada para a Santander Dev Week.

## [Link do Figma](https://www.figma.com/file/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?type=design&node-id=1421%3A432&mode=design&t=6dPQuerScEQH0zAn-1)

O Figma foi utilizado para a abstração do domínio desta API, sendo útil na análise e projeto da solução.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```

## Configs

Para configurar o ambiente de desevolvimento no **VSCode**, seguir os seguintes passos:

1. Run -> Open Configurations:
2. Dentro do launch.json, adicionar o seguinte objeto: 

```
"env": {
  "SPRING_PROFILES_ACTIVE": "DEV"
}

```
Para configurar o ambiente de desevolvimento no **IntelliJ**, seguir os seguintes passos:

1. Run/Debug Cinfigurations
2. No campo Environment Variables, adicionar a seguinte variável: **SPRING_PROFILES_ACTIVE: dev**


santander-api-spring-prd.up.railway.app