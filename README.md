# Avanade Decola Tech 2025
Projeto Java RESTful API - Avanade Decola Tech 2025

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +Process[] processes
        +AvailableOptions availableOptions
    }

    class Process {
        +String id
        +String title
        +String management
        +String status
        +String priority
        +String creationDate
        +String dueDate
        +String responsible
        +String description
    }

    class AvailableOptions {
        +String[] titles
        +String[] managements
        +String[] statuses
        +String[] priorities
    }

    User "1" *-- "1" Process
    User "1" *-- "N" AvailableOptions
```
