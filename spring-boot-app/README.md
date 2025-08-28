# Java CI/CD Pipeline Application

A basic Spring Boot application designed for CI/CD pipeline demonstration with Jenkins, ArgoCD, Helm, and Kubernetes.

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Building the Application

To build the application, run:

```bash
mvn clean package
```

## Running the Application

### Using Maven
```bash
mvn spring-boot:run
```

### Using JAR file
```bash
java -jar target/java-cicd-app-0.0.1-SNAPSHOT.jar
```

## Testing the Application

### Running Tests
```bash
mvn test
```

### Manual Testing
Once the application is running, you can test the endpoints:

1. **Welcome Message**: `http://localhost:8080/`
   - Expected output: "Welcome to the app"

2. **Health Check**: `http://localhost:8080/health`
   - Expected output: "Application is running!"

## Application Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/javacicdapp/
│   │       ├── JavaCicdAppApplication.java
│   │       └── controller/
│   │           └── WelcomeController.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── com/example/javacicdapp/
            ├── JavaCicdAppApplicationTests.java
            └── controller/
                └── WelcomeControllerTest.java
```

## Configuration

The application runs on port 8080 by default. You can modify the port in `src/main/resources/application.properties`.

## Docker Support

To build a Docker image:

```bash
docker build -t java-cicd-app .
```

To run the Docker container:

```bash
docker run -p 8080:8080 java-cicd-app
``` 

## Next Steps

### Configure a Sonar Server locally

```
adduser sonarqube (Do it on root User)
apt install unzip
sudo su - sonarqube 
wget https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-10.4.1.88267.zip
unzip *
chmod -R 755 /home/sonarqube/sonarqube-10.4.1.88267 
chown -R sonarqube:sonarqube /home/sonarqube/sonarqube-10.4.1.88267
cd sonarqube-10.4.1.88267/bin/linux-x86-64/
./sonar.sh start
```

Now you can access the `SonarQube Server` on `http://<ip-address>:9000` 