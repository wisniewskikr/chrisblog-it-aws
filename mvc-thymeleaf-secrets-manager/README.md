SPRING BOOT MVC, THYMELEAF AND AWS SECRETS MANAGER
==================================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting


DESCRIPTION
-----------

#####Goal
The goal of this project is to show how to create Java application with Spring Boot MVC and Thymeleaf
and AWS Secrets Manager. Displayed message is stored in AWS Secrets Manager. 

#####Details
This project consists of one page:
* **Greeting Page**: this page just displays text "Hello World". This text is stored in AWS Secrets Manager.


#####Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf


IMPLEMENTATION
-----------

#####Prerequisites:
* This project is based on existing project "mvc-thymeleaf".

#####Implementation details:
* Update file pom.xml with AWS Secrets Manager dependencies;
* Update file application.properties with AWS User and AWS Secrets Manager data;
* Create class SecretsManagerResponse with response from AWS Secrets Manager;
* Create class SecretsManagerService which contacts with AWS Secrets Manager;
* Update class GreetingController to read message from SecretsManagerService. 

  

LAUNCH
------

To launch project please run following class: 
* Application.java

You can also launch project using Maven command:
* mvn spring-boot:run -Dspring.thymeleaf.cache=false


USAGE
-----

Link to main UI:
* http://[server]/app/greeting