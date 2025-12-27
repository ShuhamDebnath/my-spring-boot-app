# 🍃 Spring Boot Crash Course (Kotlin)

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Kotlin](https://img.shields.io/badge/Kotlin-2.2.21-purple?style=for-the-badge&logo=kotlin)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.1-green?style=for-the-badge&logo=spring-boot)
![Gradle](https://img.shields.io/badge/Gradle-Build-blue?style=for-the-badge&logo=gradle)

## 📖 About The Project

Welcome to my **Spring Boot Learning Journey**! 🚀

This repository contains the source code for my exploration into backend development using **Spring Boot** with **Kotlin**. As an Android developer, this project serves as a bridge to understanding server-side architecture, REST APIs, and the Spring ecosystem.

### 🎯 Goals
- Learn the fundamentals of **Spring Boot 3/4**.
- Understand **Dependency Injection (IoC)**.
- Build robust **RESTful APIs**.
- Implement **Spring Security** basics.
- Bridge the gap between Android (Client) and Spring (Server).

---

## 🛠️ Tech Stack

* **Language:** Kotlin
* **Framework:** Spring Boot 4.0.1
* **Build Tool:** Gradle (Kotlin DSL)
* **JDK:** Java 21 (LTS)
* **Dependencies:**
    * `spring-boot-starter-web` (REST APIs)
    * `spring-boot-starter-security` (Authentication/Authorization)
    * `jackson-module-kotlin` (JSON Serialization)

---

## 🚀 Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites

* **Java 21 SDK** installed.
* **IntelliJ IDEA** (Recommended) or VS Code.

### Installation

1.  **Clone the repository**
    ```bash
    git clone [https://github.com/YOUR_USERNAME/spring-boot-crash-course.git](https://github.com/YOUR_USERNAME/spring-boot-crash-course.git)
    cd spring-boot-crash-course
    ```

2.  **Build the project**
    ```bash
    ./gradlew build
    ```

3.  **Run the Application**
    ```bash
    ./gradlew bootRun
    ```

The server will start on: `http://localhost:8080`

---

## 📂 Project Structure

```text
src
├── main
│   ├── kotlin/com/shuham/springbootcrashcourse
│   │   ├── Application.kt       # Entry Point
│   │   ├── controller/          # API Endpoints
│   │   ├── service/             # Business Logic
│   │   └── model/               # Data Classes
│   └── resources
│       └── application.properties # Config (Port, DB, etc.)
└── test                         # Unit & Integration Tests
```

---
👤 Author
---------

**Suham Debnath**

-   **Role:** Android Developer & Backend Enthusiast

-   **Location:** Tripura, India

-   **GitHub:** [@YOUR_GITHUB_USERNAME](https://www.google.com/search?q=https://github.com/YOUR_GITHUB_USERNAME)

---

🤝 Contributing
---------------

Contributions, issues, and feature requests are welcome! Feel free to check the [issues page](https://www.google.com/search?q=https://github.com/YOUR_USERNAME/spring-boot-crash-course/issues).

1.  Fork the Project

2.  Create your Feature Branch (`git checkout -b feature/AmazingFeature`)

3.  Commit your Changes (`git commit -m 'Add some AmazingFeature'`)

4.  Push to the Branch (`git push origin feature/AmazingFeature`)

5.  Open a Pull Request

---

⭐️ **If you found this helpful, please give the repository a star!**
