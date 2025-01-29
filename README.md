# Proyecto de Práctica con Java, Spring Boot, JPA y REST

Este proyecto tiene como objetivo principal proporcionar un entorno práctico para aprender y reforzar conocimientos de **Java** con **Spring Boot**, centrándose en la implementación de **JPA** para la persistencia de datos y la creación de APIs **RESTful**.

## 🛠️ Propósito del Proyecto

- Practicar la creación de APIs RESTful con Spring Boot.
- Implementar la persistencia de datos utilizando Spring Data JPA.
- Reforzar conceptos básicos y avanzados de la arquitectura en capas en el desarrollo backend.
- Experimentar con la configuración y personalización de proyectos Spring Boot.

## 📂 Estructura del Proyecto

El proyecto está diseñado para ser modular y facilitar la comprensión de cada componente:

```bash
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── backend
│   │   │           ├── BackendApplication.java
│   │   │           ├── model
│   │   │           │   ├── estado.java
│   │   │           │   ├── pais.java
│   │   │           │   └── persona.java
│   │   │           ├── repository
│   │   │           │   ├── estadoRepository.java
│   │   │           │   ├── paisRepository.java
│   │   │           │   └── personaRepository.java
│   │   │           ├── rest
│   │   │           │   ├── estadoREST.java
│   │   │           │   ├── paisREST.java
│   │   │           │   └── personaREST.java
│   │   │           └── service
│   │   │               ├── estadoService.java
│   │   │               ├── paisService.java
│   │   │               └── personaService.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── backend
│                   └── backend
│                       └── BackendApplicationTests.java
└── target
    ├── classes
    │   ├── application.properties
    │   └── com
    │       └── backend
    │           ├── BackendApplication.class
    │           ├── model
    │           │   ├── estado.class
    │           │   ├── pais.class
    │           │   └── persona.class
    │           ├── repository
    │           │   ├── estadoRepository.class
    │           │   ├── paisRepository.class
    │           │   └── personaRepository.class
    │           ├── rest
    │           │   ├── estadoREST.class
    │           │   ├── paisREST.class
    │           │   └── personaREST.class
    │           └── service
    │               ├── estadoService.class
    │               ├── paisService.class
    │               └── personaService.class
    └── test-classes
        └── com
            └── backend
                └── backend
                    └── BackendApplicationTests.class
```

## 🚀 Funcionalidades Principales

1. **Modelos de Datos**:
   - `persona`: Representa información básica de una persona.
   - `pais`: Representa un país.
   - `estado`: Representa un estado o provincia asociado a un país.

2. **APIs RESTful**:
   - Endpoints creados para realizar operaciones CRUD con las entidades `persona`, `pais` y `estado`.

3. **Persistencia de Datos**:
   - Implementación de repositorios JPA para gestionar el acceso a la base de datos.

4. **Modularidad**:
   - Separación de responsabilidades utilizando la arquitectura en capas (modelo, repositorio, servicio y controlador).

## 📌 Requisitos Previos

- **Java 17** (o superior).
- **Maven** como herramienta de construcción.
- Conocimientos básicos de Java y Spring Boot.

## Conceptos Clave Practicados

#### Spring Boot:
- Configuración rápida de proyectos backend.
- Uso de anotaciones como `@RestController`, `@Service`, y `@Repository`.
- Configuración de propiedades en `application.properties`.

#### JPA (Java Persistence API):
- Definición de entidades con `@Entity`.
- Relaciones entre entidades (por ejemplo, `@OneToMany`, `@ManyToOne`).
- Consultas básicas mediante interfaces `JpaRepository`.

#### API REST:
- Creación de controladores con operaciones CRUD.
- Gestión de rutas y mapeo de solicitudes con `@RequestMapping`, `@GetMapping`, `@PostMapping`, etc.
- Formato JSON en respuestas y solicitudes.

#### Buenas Prácticas:
- Organización de código en capas: `Controller`, `Service`, `Repository`.
- Separación de responsabilidades en el proyecto.
- Uso de nombres descriptivos para clases, métodos y rutas.

#### Otros Conceptos:
- Uso del principio de inyección de dependencias con `@Autowired`.
- Manejo de errores básicos en endpoints REST.
- Testing inicial con clases `@SpringBootTest`.

#### Herramientas Adicionales:
- `Maven`: Gestión de dependencias y construcción del proyecto.
- `Postman`: Testing de endpoints REST.
- `PostgreSQL`: Creación e inyección de datos directamente en BD asi como consultas para validar correcto relacionamiento.


🧩 Próximos Pasos

    Añadir validación de datos utilizando Bean Validation (@Valid).
    Implementar manejo de excepciones con un controlador global.
    Crear pruebas unitarias para los servicios y controladores.
