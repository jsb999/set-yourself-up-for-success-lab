# Set Yourself Up for Success (Java)

## Overview
This is a simple Java console application that demonstrates basic project setup with Gradle. The application prints "Hello World!" when run and includes JUnit 5 tests.

**Current State:** The project is fully configured and running in Replit.

## Project Information
- **Language:** Java 21
- **Build System:** Gradle 8.14.1
- **Testing Framework:** JUnit Jupiter 5.12.1
- **Dependencies:** 
  - Google Guava 33.4.5
  - JUnit Jupiter 5.12.1 (test)

## Project Structure
```
.
├── app/
│   ├── src/
│   │   ├── main/java/org/example/
│   │   │   └── App.java          # Main application class
│   │   └── test/java/org/example/
│   │       └── AppTest.java      # JUnit tests
│   └── build.gradle              # App-level build configuration
├── gradle/                       # Gradle wrapper files
├── settings.gradle               # Project settings
└── gradlew                       # Gradle wrapper script
```

## Recent Changes
- **2025-11-19:** Initial Replit setup
  - Configured Java runtime (GraalVM)
  - Set up workflow to run the application
  - Verified build and tests work correctly

## Available Commands

### Run the Application
The application is configured to run automatically via the "Run Java App" workflow. You can also run it manually:
```bash
./gradlew run --quiet --console=plain
```

### Build the Project
```bash
./gradlew build
```

### Run Tests
```bash
./gradlew test
```

## How It Works
The main application class (`App.java`) contains:
- A `getGreeting()` method that returns "Hello World!"
- A `main()` method that prints the greeting

The test class (`AppTest.java`) verifies that the greeting is not null.

## Replit Configuration
- **Workflow:** Runs `./gradlew run --quiet --console=plain` to execute the application
- **Output Type:** Console (this is a command-line application)
- **Java Version:** Java 21 via GraalVM

## User Preferences
No specific user preferences have been set yet.
