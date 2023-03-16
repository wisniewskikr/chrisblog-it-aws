AWS LAMBDA
==========


DESCRIPTION
-----------

#####Goal
The goal of this project is to show how to create AWS Lambda project.

#####Details
This project consists of one handler class which takes "name" as input and returns "Hello World name" as output. 

#####Result 
After running this Lambda project in AWS object String "Hello World name" should be returned.

#####Used technologies:
* **BE**: AWS Lambda


IMPLEMENTATION
-----------

#####Prerequisites:
* None

#####Implementation details:
* Create file pom.xml with all necessary Lambda dependencies;
* Create class "GreetingHandler.java" with Lambda method.
  

LAUNCH
------

To launch project please: 
* Build .jar file with maven command: **mvc clean package**
* Deploy .jar file in AWS
* Run Lambda test in AWS