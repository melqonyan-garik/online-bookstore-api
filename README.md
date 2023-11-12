# Online Bookstore API

This Spring Boot application manages an online bookstore, providing a RESTful API for CRUD operations on books, authors, and genres.

## Table of Contents

- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Test Coverage and Code Quality](#test-coverage-and-code-quality)
- [Deployment](#deployment)
- [Built With](#built-with)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven (for building and managing dependencies)

```bash
git clone https://github.com/yourusername/bookstore-api.git
cd bookstore-api
```
Build the project:
```bash
mvn clean install
```
Configuration
Database configuration is defined in application.properties (or application.yml).
Additional configuration can be found in the respective configuration files.

Running the Application
Run the application using your preferred method:

```bash
mvn spring-boot:run
```
The application will be accessible at http://localhost:8080.

API Endpoints
Books
* GET /api/books: Get a list of all books.
* GET /api/books/{id}: Get details of a specific book.
* POST /api/books: Create a new book.
* PUT /api/books/{id}: Update an existing book.
* DELETE /api/books/{id}: Delete a book.
Authors and Genres
(Similar endpoints for authors and genres)

Search
* GET /api/books/search?keyword={keyword}: Search for books by title, author, or genre.
Testing
Run tests using your preferred method:
```bash
mvn test
```

Test Coverage and Code Quality
Test coverage reports are generated using JaCoCo.
Code quality analysis is performed using SonarQube.

Deployment
Deploy the application to a server or a cloud platform.
Configure the database connection for production in application.properties or environment variables.

## Built With

Spring Boot: Framework for building Java-based enterprise applications.

Hibernate: Object-relational mapping framework for Java.

Maven: Dependency management and build tool.

## Conversation Logs

ChatGPT conversation logs are available in the file [chat.log](src/main/resources/chat.log).
Conversation link: https://chat.openai.com/share/8f1e7a90-cd96-46c8-b2f5-524452bb13c5

# Project Feedback

- **Was it easy to complete the task using AI?**
    - Absolutely, leveraging AI made the task significantly more straightforward.

- **How long did the task take you to complete?**
    - The task was successfully wrapped up in just over 1 hour.

- **Was the code ready to run after generation? What did you have to change to make it usable?**
    - The generated code was ready to run; I made minor adjustments to the readme for clarity.

- **Which challenges did you face during completion of the task?**
    - The primary challenge revolved around formulating questions in a manner that AI could understand, leading to satisfactory responses.

## Contributing
Feel free to contribute by opening issues or pull requests. Your feedback is highly appreciated.