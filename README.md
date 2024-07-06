## Introduction
### Calculation Task Application using Runnable Interface

This Spring Boot application demonstrates running multiple calculation tasks concurrently using Java threads and Spring framework's RESTful web services.

#### Project Structure

- **CalculationController**: REST controller handling HTTP requests for running calculation tasks.
- **CalculationService**: Service layer implementing calculation tasks such as square, cube, prime check, etc.
- **CalculationTask**: Utility class providing methods for various mathematical operations (square, cube, prime check, etc.).
- **CalculationTaskApplication**: Main Spring Boot application class responsible for application startup.

#### Dependencies

- **Spring Boot Starter Web**: For creating RESTful web services.
- **SpringDoc OpenAPI**: Provides Swagger UI for API documentation.
- **Lombok**: Java library to reduce boilerplate code (used for generating getters, setters, constructors, etc.).
- **JUnit**: Framework for writing and running tests.

#### Running the Application

To run the application:
1. Clone the repository.
```bash
git clone https://github.com/Jayesh2026/AssessmentTask_2_CalculationApplicationUsingRunnableInterface.git
```
2. Navigate to the project directory.
3. Execute `./gradlew bootRun` (on Unix-based systems) or `gradlew bootRun` (on Windows) to start the Spring Boot application.

The application will start on port 8081 by default.

#### Endpoints

- **GET /calculation/run**: Initiates multiple calculation tasks concurrently.
  - Tasks include computing square, cube, checking even/prime/armstrong/palindrome, factorial, and reversing a number.
  - Each task is executed asynchronously using Java threads.

#### Usage

1. Access `http://localhost:8081/swagger-ui.html` in a web browser to view Swagger UI.
2. Use the `http://localhost:8081/calculation/run` endpoint to trigger all calculation tasks concurrently.
3. Check the console logs or application logs (if configured) to see the results of each calculation task.

#### Notes

- Ensure Java 21 (or compatible version) is installed.
- Modify `number` input in `CalculationService` constructor to change the number for calculations.
- Exception handling is implemented to log errors in case of any exceptions during task execution.

