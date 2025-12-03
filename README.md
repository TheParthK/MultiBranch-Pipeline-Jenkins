# MultiBranch Pipeline Application

A simple Java application demonstrating Multi-Branch Pipeline in Jenkins.

## Prerequisites

- Java 17 (OpenJDK)
- Maven 3.6.3
- Jenkins with Pipeline plugin
- Git

## Building Locally

```bash
mvn clean install
```

## Running Tests

```bash
mvn test
```

## Project Structure

```
.
├── pom.xml                          # Maven project file
├── Jenkinsfile                      # Jenkins pipeline definition
├── README.md                        # This file
└── src/
    ├── main/
    │   └── java/
    │       └── com/example/
    │           └── Application.java # Main application class
    └── test/
        └── java/
            └── com/example/
                └── ApplicationTest.java # Unit tests
```

## Git Branches

This project uses multiple branches for demonstration:
- **main** - Production branch (stable code)
- **develop** - Development branch (latest features)
- **feature/enhancement** - Feature branch (new functionality)

Jenkins Multi-Branch Pipeline automatically creates pipelines for each branch.

## Pipeline Stages

1. **Checkout** - Clones code from the branch
2. **Build** - Compiles the Java code using Maven
3. **Test** - Runs unit tests with JUnit
4. **Package** - Creates JAR artifact
5. **Archive** - Archives the built JAR file

## Expected Build Output

All unit tests should pass:
- ✓ testGreet - Tests the greet method
- ✓ testAdd - Tests addition functionality
- ✓ testAddNegative - Tests addition with negative numbers

## Artifact Location

Built JAR file: `target/multibranch-app-1.0.0.jar`

## Getting Started with Jenkins

1. Create a Multi-Branch Pipeline job in Jenkins
2. Configure GitHub source with this repository URL
3. Jenkins will automatically detect and build all branches
4. Monitor builds from the Jenkins dashboard

## Features

- Simple Java application with business logic
- Unit tests with JUnit framework
- Declarative Jenkinsfile for easy pipeline management
- Automatic branch discovery
- Artifact archiving for each build
- Build status tracking per branch

## License

MIT
