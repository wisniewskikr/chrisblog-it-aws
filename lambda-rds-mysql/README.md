AWS LAMBDA AND RDS MYSQL
========================


DESCRIPTION
-----------

#####Goal
The goal of this project is to show how to create AWS Lambda project and connect with with RDS MySql.

#####Details
This project consists of one handler class which takes "text" from RDS MySql and display it as output. 

#####Result 
After running this Lambda project in AWS object String "Hello World!" should be returned.

#####Used technologies:
* **BE**: AWS Lambda


IMPLEMENTATION
-----------

#####Prerequisites:
* This project is based on existing project "lambda";
* This project uses RDS MySql database. Schema: "greeting-schema". Database: "greeting_database". Table: "GREETING" with column "text". 

#####Implementation details:
* Update file pom.xml with MySql connector: "mysql-connector-java";
* Update class "GreetingHandler.java" with connection to RDS MySql.
  

LAUNCH
------

To launch project please: 
* Build .jar file with maven command: **mvc clean package**
* Deploy .jar file in AWS
* Run Lambda test in AWS