# Proyecto de Práctica con Java, Spring Boot, JPA y REST

Este proyecto tiene como objetivo principal proporcionar un entorno práctico para aprender y reforzar conocimientos de **Java** con **Spring Boot**, centrándose en la implementación de **JPA** para la persistencia de datos y la creación de APIs **RESTful**.

## 🛠️ Propósito del Proyecto

- Practicar la creación de APIs RESTful con Spring Boot.
- Implementar la persistencia de datos utilizando Spring Data JPA.
- Reforzar conceptos básicos y avanzados de la arquitectura en capas en el desarrollo backend.
- Experimentar con la configuración y personalización de proyectos Spring Boot.
- Implementar y experimentar con JUnit y las pruebas unitarias para validar el correcto funcionamiento del proyecto.

## 📂 Estructura del Proyecto

El proyecto está diseñado para ser modular y facilitar la comprensión de cada componente:

```bash
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── backend
│   │   │           ├── BackendApplication.java
│   │   │           ├── model
│   │   │           │   ├── Estado.java
│   │   │           │   ├── Pais.java
│   │   │           │   └── Persona.java
│   │   │           ├── repository
│   │   │           │   ├── EstadoRepository.java
│   │   │           │   ├── PaisRepository.java
│   │   │           │   └── PersonaRepository.java
│   │   │           ├── rest
│   │   │           │   ├── EstadoREST.java
│   │   │           │   ├── PaisREST.java
│   │   │           │   └── PersonaREST.java
│   │   │           └── service
│   │   │               ├── EstadoService.java
│   │   │               ├── PaisService.java
│   │   │               └── PersonaService.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── backend
│                   ├── BackendApplicationTests.java
│                   └── model
│                       ├── EstadoTest.java
│                       ├── PaisTest.java
│                       └── PersonaTest.java
└── target
    ├── classes
    │   ├── application.properties
    │   └── com
    │       └── backend
    │           ├── BackendApplication.class
    │           ├── model
    │           │   ├── Estado.class
    │           │   ├── Pais.class
    │           │   └── Persona.class
    │           ├── repository
    │           │   ├── EstadoRepository.class
    │           │   ├── PaisRepository.class
    │           │   └── PersonaRepository.class
    │           ├── rest
    │           │   ├── EstadoREST.class
    │           │   ├── PaisREST.class
    │           │   └── PersonaREST.class
    │           └── service
    │               ├── EstadoService.class
    │               ├── PaisService.class
    │               └── PersonaService.class
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    ├── maven-status
    │   └── maven-compiler-plugin
    │       ├── compile
    │       │   └── default-compile
    │       │       ├── createdFiles.lst
    │       │       └── inputFiles.lst
    │       └── testCompile
    │           └── default-testCompile
    │               ├── createdFiles.lst
    │               └── inputFiles.lst
    ├── surefire-reports
    │   ├── com.backend.BackendApplicationTests.txt
    │   ├── com.backend.backend.BackendApplicationTests.txt
    │   ├── TEST-com.backend.BackendApplicationTests.xml
    │   └── TEST-com.backend.backend.BackendApplicationTests.xml
    └── test-classes
        └── com
            └── backend
                ├── BackendApplicationTests.class
                └── model
                    ├── EstadoTest.class
                    ├── PaisTest.class
                    └── PersonaTest.class
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

5. **Pruebas unitarias**:
   - Pruebas unitarias para validar funcionamiento correcto de las clases.

## 📌 Requisitos Previos

- **Java 17** (o superior).
- **Maven** como herramienta de construcción.
- **JUnit5** utilizada para realizar pruebas unitarias.
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

#### JUnit:
- Se han implementado pruebas unitarias básicas usando JUnit 5 para las entidades Pais, Persona y Estado, con el objetivo de asegurar que las funcionalidades CRUD básicas están correctamente implementadas.

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
