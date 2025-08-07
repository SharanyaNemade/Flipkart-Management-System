# Flipkart-Management-System
A Flipkart clone built using Spring Boot, Java 17, Spring Security, Thymeleaf, and MySQL. It features secure user registration and login, role-based authentication, dynamic HTML rendering, and MVC architecture. Ideal for learning modern Java web app development with real-world practices.





# 🛒 Flipkart Clone (Spring Boot Web Application)

This is a **Flipkart clone** web application developed using **Spring Boot** and related technologies. It features a secure user registration and login system, dynamic HTML views with Thymeleaf, and proper MVC architecture. The project simulates basic e-commerce functionalities like registration, login, and homepage views.

## 📌 Project Description

This application demonstrates a simplified version of an e-commerce platform (Flipkart) focused on **user management** and **authentication**. It includes the following features:

- User registration with field validation
- Secure login with Spring Security
- Role-based authentication
- Thymeleaf-based dynamic views
- Modular service architecture using MVC
- MySQL database integration using Spring Data JPA

---

## 🚀 Technologies Used

| Layer/Feature       | Technology                  |
|---------------------|-----------------------------|
| Project Build Tool   | Maven                       |
| Language             | Core Java 17                |
| Framework            | Spring Boot                 |
| Security             | Spring Security             |
| Templating Engine    | Thymeleaf                   |
| Form Validation      | Hibernate Validator         |
| ORM Layer            | Spring Data JPA             |
| Database             | MySQL                       |
| Hot Reloading        | Spring Boot DevTools        |

---

## 📁 Project Structure Overview



src/
├── main/
│ ├── java/
│ │ └── com.flipkart/
│ │ ├── FlipkartApplication.java
│ │ ├── config/
│ │ │ └── SecurityConfig.java
│ │ ├── controller/
│ │ │ ├── HomeController.java
│ │ │ └── LoginController.java
│ │ ├── entity/
│ │ │ └── User.java
│ │ ├── repository/
│ │ │ └── UserRepository.java
│ │ └── service/
│ │ ├── CustomUserDetailsService.java
│ │ └── RegistrationService.java
│ └── resources/
│ ├── static/
│ └── templates/
│ ├── about.html
│ ├── base.html
│ ├── footer.html
│ ├── header.html
│ ├── index.html
│ ├── login.html
│ └── register.html
│ └── application.properties






---

## 🛠️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/flipkart-clone.git
   cd flipkart-clone
Configure the MySQL database

2. **Create a MySQL database (e.g., flipkartdb)**

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/flipkartdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


3. **Run the application**

./mvnw spring-boot:run


4.**Access in browser**

Navigate to http://localhost:8080/



5. **🔐 Security Features**
Password encryption using BCrypt

Login form with Spring Security integration

User roles and authorities (customizable for future expansion)



6. **✅ Future Enhancements (Suggested)**

Add product listing and shopping cart
Admin panel for product management
Payment gateway integration
User profile and order history



**📄 License**
This project is open-source and available for educational and demonstration purposes.

**🤝 Contributing**
Feel free to fork the repository and open pull requests for improvements or features.

**👨‍💻 Author**
Sharanya Nemade
Full Stack Java Developer
