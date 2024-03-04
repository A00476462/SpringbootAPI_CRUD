Introducation:
This program, built using Spring Boot, implements essential CRUD (Create, Read, Update, Delete) functionalities for interacting with a database. Users can perform operations such as "GET", "POST", "PUT", and "DELETE" to manage data stored in the connected database.

Please download MySQL and Postman before running the program.

## "GET" all information from the database in Postman example:

### Request:
HTTP method: GET
URL: http://localhost:8080/hotelTest

### Response:
[
    {
        "id": 1,
        "name": "hotel1",
        "address": "hotel1Address",
        "phoneNumber": "7821234568"
    },
    {
        "id": 4,
        "name": "hotel4",
        "address": "hotel4Address",
        "phoneNumber": "7821234560"
    }
]

## "GET" a specific information from the database in Postman example:

### Request:
HTTP method: GET
URL: http://localhost:8080/hotelTest/1

### Response:
{
    "id": 1,
    "name": "hotel1",
    "address": "hotel1Address",
    "phoneNumber": "7821234568"
}

## "POST" a specific information to the database in Postman example:

### Request:
HTTP method: POST
URL: http://localhost:8080/hotelTest
BODY:
```json
{
    "id": 1,
    "name": "hotel1",
    "address": "hotel1Address",
    "phoneNumber": "7821234568"
}

### Response:
hotel info created successfully

## "PUT" a specific information to the database in Postman example:

### Request:
HTTP method: PUT
URL: http://localhost:8080/hotelTest
BODY:
```json
{
    "id": 1,
    "name": "hotel1_updated",
    "address": "hotel1Address",
    "phoneNumber": "7821234568"
}

### Response:
hotel info update successfully

### Request:
HTTP method: DELETE
URL: http://localhost:8080/hotelTest/1

### Response:
hotel info delete successfully


# Configuration Instructions

Before running the program, please ensure the following configurations are adjusted in the "application.yaml" file to avoid errors:

## Adjustments in "application.yaml"

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/hotel?useSSL=false
    username: root
    password: 123456789

1. URL Configuration:
	Change the URL according to your MySQL server configuration.
		localhost:3306 is the default port for MySQL. If you are using a different port, modify it accordingly.
		hotel is the default database name in MySQL. If you are using a different database, replace hotel with your own database name, or create a database named "hotel".

2. Username Configuration:
	Change the MySQL username in the "application.yaml" file to match your MySQL configuration.

3. Password Configuration:
	Change the MySQL password in the "application.yaml" file to match your MySQL configuration.

4. MySQL Workbench:
	Ensure that MySQL Workbench is opened before running the program.

Result:
Upon running the program, the "hotel_info" table will be created. Refresh your database if you cannot see the "hotel_info" table in the "hotel" database.
Data will be automatically inserted into the "hotel_info" table when you make a POST request in Postman.
Data will be automatically updated when you make a PUT request in Postman.
Data will be automatically deleted when you make a DELETE request in Postman (please include a specific ID in the URL when deleting).
