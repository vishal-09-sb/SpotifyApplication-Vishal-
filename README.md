# Spotify App Case Study

## Overview:
This project aims to develop a music application, "Spotify App," allowing users to register, login, search for music tracks, save favorites, and manage their wishlist. The application integrates with the Spotify API for fetching music tracks.

## Functional Requirements:
- User-friendly UI for registration, login, music track listing, search, favorite track management.
- Responsive UI for smooth performance across various devices.

## Non-functional Requirements:
- Quick loading and smooth performance on low-end devices.
- Scalability to handle a large user base.
- Easy navigation for users with no prior music app experience.
- Data security measures to protect user information.

## Technical Requirements:
- Backend developed using Microservices architecture with JWT token security.
- Frontend developed using Angular/React.
- Utilization of Microservice patterns like API Gateway, Service Discovery, etc.
- Comprehensive testing with Unit and Integration tests.
- Integration with SQL databases on Cloud (AWS).
- Source code management using Gitlab.
- API documentation using Swagger.
- CI/CD process integration on AWS.
- Tools and Technologies include Gitlab, Spring Boot, Angular/React, MySQL, JUnit, Jest/Jasmine, Sonar Lint, Docker, AWS services.

## User Stories:
- Register, login, search, save, access, and delete music tracks.

## High Level Architecture Diagram:


<img width="445" alt="Architecture" src="https://github.com/vishal-09-sb/SpotifyApplication-Vishal-/assets/61041718/26d32832-a5f0-4f07-af5a-31d22080df1b">


## Microservices Responsibilities:
- User Profile Service: Store user registration details and publish credentials.
- Authentication Service: Validate login credentials and generate JWT tokens.
- Music Service: Access Spotify API for fetching music tracks.
- Wishlist Service: Store user bookmarked music tracks.
- API Gateway: Validate JWT tokens and route requests.
- Eureka Server: Service registry for microservices.
- Config Server: Centralized configuration storage.

## Recommended Steps:
1. Understand the case study.
2. Identify the Data Model and draw data flow diagram.
3. Draw UI wireframes.
4. Create boilerplate.
5. Setup CI/CD pipeline.
6. Implement and test backend.
7. Implement and test frontend.
8. Integrate frontend with backend.
9. Dockerize all services.
10. Configure Docker Compose for container orchestration.
11. Deploy to Cloud (EC2 instances, Cloud SQL databases).

## Deployment:
- Backend and frontend deployed on EC2 instances.
- Cloud SQL databases used for data storage.

**Note:** Detailed documentation and implementation guidelines are provided in the case study. For more information, refer to the provided materials.
