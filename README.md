# Resort Booking Management - Spring Boot CRUD Project  

This project is a **Spring Boot CRUD application** for managing resort bookings. It allows users to perform basic operations like adding, retrieving, updating, and deleting bookings for customers.  

## Project Structure
list_project_players2/
│── src/main/java/com/tka/
│   ├── controller/
│   │   ├── ResortController.java
│   ├── service/
│   │   ├── ResortService.java
│   │   ├── ResortServiceImpl.java
│   ├── dao/
│   │   ├── ResortDAO.java
│   │   ├── ResortDAOInterface.java
│   ├── entity/
│   │   ├── Customers.java
│   ├── ListProjectPlayers2Application.java  (Main Spring Boot Application)
│
│── src/main/resources/
│   ├── application.properties  (Database Configuration)
│
│── pom.xml  (Maven dependencies)
│── README.md  (Project Description)
│── .gitignore  (Ignore target files, dependencies)


## Features  

- **Add a Booking**: Insert a single customer booking.
  
- **Add Multiple Bookings**: Insert multiple customer bookings in one request.
   
- **Retrieve All Bookings**: Fetch a list of all bookings.
  
- **Retrieve Booking by Room Type**: Get bookings filtered by room type.
   
- **Update Booking**: Modify an existing booking.
  
- **Delete Booking**: Remove a booking by ID.  



## Technologies Used

- **Java**
 
- **Spring Boot**
 
- **Hibernate**
 
- **MySQL**
 
- **Maven**  



## Prerequisites  

- JDK 17 or later
 
- MySQL Database
   
- Maven
   
- IDE (e.g., IntelliJ IDEA, Eclipse)
