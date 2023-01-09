# Pharmacy Location - Administration
This is the administrative portal for the Pharmacy Location Service, a web application built with Spring Boot that allows users to search for pharmacies in their area.

As an administrator, you can:

Add, update, and delete pharmacy information
View pharmacy
View Pharmacy Emergency
Validate Pharmacy

# Prerequisites
Java 8 or above
Maven
MySQL
# Getting Started
Clone the repository: git clone https://github.com/faouziahamsy/pharmacie-localisation-administration.git
Navigate to the project directory: cd pharmacy-location-service-admin
Create a MySQL database and add the necessary tables using the provided SQL scripts
Create a file named application.properties in the src/main/resources directory and add the following properties:
spring.datasource.url: the JDBC URL of the MySQL database
spring.datasource.username: the username for the MySQL database
spring.datasource.password: the password for the MySQL database
Build the project: mvn clean install
Run the project: mvn spring-boot:run
# Built With
Spring Boot
Thymeleaf
Bootstrap
Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

# License
This project is licensed under the HAB License - see the LICENSE file for details.
