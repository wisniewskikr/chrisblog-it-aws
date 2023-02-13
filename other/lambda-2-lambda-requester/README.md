AWS LAMBDA REQUESTER
=====================


DESCRIPTION
-----------

#####Goal
The goal of this project is to show how to call one Lambda from another in AWS. 
This is an example of Lambda Requester which calls another Lambda Responser.

#####Details
This project consists of one Handler class which takes "name" as input and returns "Hello World name" as output. 

#####Result 
After running this Lambda project in AWS then JSON with message "Hello World name" should be returned.

#####Used technologies:
* **BE**: AWS Lambda


IMPLEMENTATION
-----------

#####Prerequisites:
* None

#####Implementation details:
* Create file pom.xml with all necessary Lambda dependencies;
* Create class "GreetingHandler.java" with Lambda method;
* Create class "GreetingRequest.java" with field "name";
* Create class "GreetingResponse.java" with field "message".
  

LAUNCH
------

To launch project please: 
* Build .jar file with maven command: **mvc clean package**
* Deploy .jar file in AWS
* Run Lambda test in AWS