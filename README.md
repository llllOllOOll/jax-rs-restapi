# Java EE 8 JAX-RS Client Management

This project is a Java EE 8 application using JAX-RS for RESTful web services, and Maven as the build tool. It provides a basic CRUD API for managing clients.

## Prerequisites

- **Apache Maven 3.6.3**
- **Java 17 (OpenJDK 17)**
- **Eclipse J22 2025-6-R**

## Project Setup

### Clone the Repository

Clone the project repository using Git:

```bash
git clone git@github.com:llllOllOOll/jax-rs-restapi.git

## Import into Eclipse

1. Open Eclipse J22 2025-6-R.
2. Go to **File > Import...**.
3. Select **Existing Maven Projects** and click **Next**.
4. Browse to the directory where you cloned the repository and select it.
5. Click **Finish** to import the project into your Eclipse workspace.

## Apply Code Formatter

This project includes a custom code formatter style to ensure consistent formatting across the codebase. The formatter style is defined in `style-formatter.xml`, which is located in the `.settings` directory of the project.

### Steps to Apply the Formatter in Eclipse:

1. Open Eclipse J22 2025-6-R.
2. Go to **Window > Preferences**.
3. Navigate to **Java > Code Style > Formatter**.
4. Click on **Import...** and select the `style-formatter.xml` file located in the `.settings` directory of the project.
5. Click **Apply and Close** to apply the formatter to your project.


## Build and Package

To build and package the application, use the following Maven commands:

```bash
mvn clean 
mvn package
```
## Run the Application

To run the application using Jetty, execute:

```bash
mvn wildfly:run


## Application Availability

The application will be available at [http://localhost:8080/](http://localhost:8080/).

## Endpoints



Create a Client

Endpoint: POST /clients
Request:

```bash
curl -X POST http://localhost:8080/webapp/api/clients      -H "Content-Type: application/json"      -d '{"id": 1, "name": "John Doe", "email": "john.doe@example.com"}'
```
```bash
 curl -X GET http://localhost:8080/webapp/api/clients/1
```

```bash
 curl -X GET http://localhost:8080/webapp/api/clients
  ```
```bash
curl -X PUT http://localhost:8080/webapp/api/clients/1      -H "Content-Type: application/json"      -d '{"name": "John Smith", "email": "john.smith@example.com"}'
```
```bash
curl -X DELETE http://localhost:8080/webapp/api/clients/1
```
