# Avanade Decola Tech 2025
Projeto Java RESTful API - Avanade Decola Tech 2025

## Diagrama de Classes

```mermaid

classDiagram
  class User {
    +String name
  }

  class Process {
    +String number
    +int dateAttribution
    +int dateExpiration
    +int limit
  }

  class Management {
    +String name
    +String description
  }

  class Type {
    +String name
    +String description
  }

  class Priority {
    +String name
    +String description
  }

  class Status {
    +String name
    +String description
  }

  User "1" *-- "1" Process
  User "1" *-- "1" Management
  User "1" *-- "1" Type
  User "1" *-- "1" Priority
  User "1" *-- "1" Status

```
## JSON
```
{
  "name": "Rafael",
  "process": {
    "number": "00050-00018829/2023-87",
    "dateAttribution": 10052025,
    "dateExpiration": 10052025,
    "limit": 15
  },
  "management": {
      "name": "GEIP",
      "description": "Descrição da Gerência"
    },
  "type": {
      "name": "Aquisição",
      "description": "Descrição do objeto"
    },
  "priority": {
      "name": "Alta",
      "description": "Descrição da Prioridade"
    },
  "status": {
      "name": "Concluído",
      "description": "Descrição do Status"
    }
}
```
## Documentação da API (Swagger)

### [https://web-production-c49d.up.railway.app/swagger-ui.html](https://web-production-c49d.up.railway.app/swagger-ui.html)
