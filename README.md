# WebClient App

### This Template demonstrate the working of WebClient API in Spring Boot project.

### This template will help you to build reactive and non-blocking web applications.

Spring WebClient is a non-blocking, reactive client for performing HTTP requests with Reactive Streams back pressure. WebClient provides a functional API that takes advantage of Java 8 Lambdas.

* WebClient API’s are introduced as part of replacing existent Spring RestTemplate.
* Spring WebClient support for both synchronous and asynchronous.

## Setup
Clone this repo and setup on your maven it needs JDK17 to run.

We have three endpoints here-
1. Suggestion API (GET) - http://localhost:9091/get/suggest, it gives suggestions for random activities.
2. List of users (GET) - http://localhost:9091/get/users, it returns a list of users.
3. Register a user (POST) - http://localhost:9091/get/register, This is a post request you need to send from postman as follows-
```json
{
  "name": "Aasif",
  "job": "Software Consultant"
}
```