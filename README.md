
# 📌 Java MySQL Database Connectivity

## 🚀 Project Description
This project demonstrates how to **connect a Java application to a MySQL database** using **JDBC (Java Database Connectivity)**. It establishes a connection with MySQL, executes SQL queries, and handles database operations efficiently.

## 🛠️ Technologies Used
- **Java** (JDK 8 or later)
- **MySQL** (Database)
- **JDBC Driver** (MySQL Connector/J)
- **Eclipse/IntelliJ IDEA** (IDE)

## ⚡ Features
✅ Establishes a connection to MySQL using JDBC.  
✅ Uses **MySQL Connector/J** for seamless interaction.  
✅ Demonstrates **basic SQL operations** (SELECT, INSERT, UPDATE, DELETE).  
✅ Includes **error handling** for database connection failures.  

## 📂 Project Structure
#### 📂 Java-MySQL-Connectivity
####   ┣ 📂 src/ 
####     ┃ ┣ 📜 Connectivity.java <-- Main JDBC connection file
####     ┃ ┣ 📜 SQL_Query_Java.java <-- Sample SQL-JAVA Query Execution file
####   ┣ 📜 README.md <-- Project documentation 
####   ┣ 📂 MySQL-Connector-JAR/ <-- MySQL JDBC Driver


## ⚙️ Setup Instructions
### 1️⃣ Install MySQL
- Download and install [MySQL Server](https://dev.mysql.com/downloads/installer/).
- Create a database using MySQL Workbench or the command line.

### 2️⃣ Download MySQL Connector/J
- Get the latest **MySQL Connector/J** from [MySQL's official site](https://dev.mysql.com/downloads/connector/j/).
- Add the **JAR file** to your project's classpath.

### 3️⃣ Adding JAR Files To projects
 #### 🔹 For Eclipse

1. **Download MySQL Connector/J**
   - Go to the official [MySQL Connector/J download page](https://dev.mysql.com/downloads/connector/j/) and download the **JAR file** (`mysql-connector-java-x.x.x.jar`).

2. **Open Eclipse**
   - Open your project in **Eclipse**.

3. **Add the JAR File to Your Project**
   - Right-click on your project in **Project Explorer**.
   - Select **Build Path → Configure Build Path**.
   - Go to the **Libraries** tab and click on **Add External JARs**.
   - Browse to and select the **mysql-connector-java-x.x.x.jar** file you downloaded.
   - Click **Apply and Close**.

4. **Verify Connection**
   - Once added, the **JAR file** will be available for use in your project, and **Eclipse** will compile and execute with this dependency.
  
 #### 🔹 For IntelliJ IDEA

1. **Download MySQL Connector/J**
   - Go to the official [MySQL Connector/J download page](https://dev.mysql.com/downloads/connector/j/) and download the **JAR file** (`mysql-connector-java-x.x.x.jar`).

2. **Open IntelliJ IDEA**
   - Open your project in **IntelliJ IDEA**.

3. **Add the JAR File to Your Project**
   - Go to **File → Project Structure → Modules**.
   - Click on the **Dependencies** tab.
   - Click the **+** button at the top and choose **JARs or directories**.
   - Select the downloaded **mysql-connector-java-x.x.x.jar** file.
   - Click **Apply** and then **OK**.

4. **Verify Connection**
   - Once added, you should be able to use **JDBC** in your project, and **IntelliJ IDEA** will include the **JAR** during compilation and execution.



###  4️⃣ Configure the Database Connection
- Modify the database credentials in `DatabaseConnection.java`:
  ```java
  String url = "jdbc:mysql://localhost:3306/your_database";
  String user = "your_username";
  String password = "your_password";

