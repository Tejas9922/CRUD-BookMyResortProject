# Resort Booking Management - Spring Boot CRUD Project  

This project is a **Spring Boot CRUD application** for managing resort bookings. It allows users to perform basic operations like adding, retrieving, updating, and deleting bookings for customers.  

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

  ## Project Structure

  src/
├── main/
│   ├── java/
│   │   ├── com/
│   │   │   ├── tka/
│   │   │   │   ├── entity/
│   │   │   │   │   └── Customers.java            // Entity class (Model)
│   │   │   │   ├── controller/
│   │   │   │   │   └── ResortController.java      // Controller class
│   │   │   │   ├── dao/
│   │   │   │   │   ├── ResortDAOInterface.java    // DAO Interface
│   │   │   │   │   ├── ResortDAOImpl.java         // DAO Implementation
│   │   │   │   ├── service/
│   │   │   │   │   ├── ResortServiceInterface.java // Service Interface
│   │   │   │   │   ├── ResortService.java          // Service Implementation
│   │   │   │   ├── repository/
│   │   │   │   │   └── CustomerRepository.java     // Spring Data JPA Repository
│   └── resources/
│       ├── application.properties                 // Configuration properties
└── test/
    ├── java/
    │   ├── com/
    │   │   └── tka/
    │   │       ├── controller/
    │   │       │   └── ResortControllerTest.java   // Unit tests for controller
    │   │       ├── service/
    │   │       │   └── ResortServiceTest.java       // Unit tests for service
    │   │       ├── dao/
    │   │       │   └── ResortDAOTest.java           // Unit tests for DAO

