SPRING BOOT MVC THYMELEAF, DOCKER AND AWS CODEBUILD
===================================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting


DESCRIPTION
-----------

This is simple Spring Boot MVC project which displays "Hello World" text. 
Main goal of this project is to show how to configure this application for AWS CodeBuild.

Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf
* **Other**: Docker


IMPLEMENTATION
--------------

Prerequisites:
* Downloaded template application "mvc-thymeleaf-docker".


Implementation details:
* Add file "buildspec.yml" where all AWS CodeBuild configuration is stored.
  

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
