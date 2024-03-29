USAGE
-----

> **NOTE** This usage assumes that user possesses **AWS Account**. It also assumes that following applications are installed on local computer: **Git Bash**, **PuTTYgen**, **PuTTY** and **WinSCP**.

Steps:
1. Create AWS EC2. Please check section **CREATE AWS EC2**
1. Connect with AWS EC2 via AWS Console. Please check section **CONNECT VIA CONSOLE**
1. Connect with AWS EC2 via bash. Please check section **CONNECT VIA BASH**
1. Connect with AWS EC2 via bash. Please check section **CONNECT VIA PUTTY**
1. Connect with AWS EC2 via bash. Please check section **CONNECT VIA WINSCP**
1. Delete AWS EC2. Please check section **DELETE AWS EC2**


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to create and delete **AWS EC2** and how to connect with it via **SSH** in following ways:
* **Via AWS Console**: it's web console provided by AWS 
* **Via bash**: it's Linux command line tool
* **Via PuTTY**: it's SSH command line client
* **Via WinSCP**: it's SSH tool for sending files

##### Terminology
Terminology explanation:
* **AWS**: Amazon Web Services it's cloud services provider created by Amazon. Shortly they provide users remote computers
* **AWS Console**: it's web console where user can manage AWS services
* **AWS EC2**: it's one of AWS services. This service is virtual machine - remote computer for users
* **SSH**: it's communication protocol between two actors

##### Flow
The following flow takes place in this project:
1. User creates AWS EC2
1. User connects with AWS EC2 using SSH. User can choose one of few options
1. User removes AWS EC2

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.

##### Technologies
This project uses following technologies:
* N/A


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)
* Installed **Git Bash**
* Installed **PuTTYgen**
* Installed **PuTTY**
* Installed **WinSCP**

##### Preconditions - Actions
* Created **AWS Account**


CREATE AWS EC2
--------------

Link:
* https://console.aws.amazon.com/

![My Image](readme-images/create-ec2-01.png)

![My Image](readme-images/create-ec2-02.png)

![My Image](readme-images/create-ec2-03.png)

![My Image](readme-images/create-ec2-04.png)

![My Image](readme-images/create-ec2-05.png)

![My Image](readme-images/create-ec2-06.png)

![My Image](readme-images/create-ec2-07.png)

![My Image](readme-images/create-ec2-08.png)

![My Image](readme-images/create-ec2-09.png)


CONNECT VIA CONSOLE
-------------------

Link:
* https://console.aws.amazon.com/

![My Image](readme-images/connect-via-console-01.png)

![My Image](readme-images/connect-via-console-02.png)

![My Image](readme-images/connect-via-console-03.png)

![My Image](readme-images/connect-via-console-04.png)

![My Image](readme-images/connect-via-console-05.png)


CONNECT VIA BASH
----------------

Link:
* https://console.aws.amazon.com/

Example Url:

```
ssh -i key.pem ec2-user@100.26.210.199
```

![My Image](readme-images/connect-via-bash-01.png)

![My Image](readme-images/connect-via-bash-02.png)

![My Image](readme-images/connect-via-bash-03.png)

![My Image](readme-images/connect-via-bash-04.png)

![My Image](readme-images/connect-via-bash-05.png)

![My Image](readme-images/connect-via-bash-06.png)


CONNECT VIA PUTTY
-----------------

Link:
* https://console.aws.amazon.com/

![My Image](readme-images/connect-via-putty-01.png)

![My Image](readme-images/connect-via-putty-02.png)

![My Image](readme-images/connect-via-putty-03.png)

![My Image](readme-images/connect-via-putty-04.png)

![My Image](readme-images/connect-via-putty-05.png)

![My Image](readme-images/connect-via-putty-06.png)

![My Image](readme-images/connect-via-putty-07.png)

![My Image](readme-images/connect-via-putty-08.png)

![My Image](readme-images/connect-via-putty-09.png)

![My Image](readme-images/connect-via-putty-10.png)

![My Image](readme-images/connect-via-putty-11.png)

![My Image](readme-images/connect-via-putty-12.png)

![My Image](readme-images/connect-via-putty-13.png)

![My Image](readme-images/connect-via-putty-14.png)

![My Image](readme-images/connect-via-putty-15.png)

![My Image](readme-images/connect-via-putty-16.png)

![My Image](readme-images/connect-via-putty-17.png)


CONNECT VIA WINSCP
------------------

Link:
* https://console.aws.amazon.com/

![My Image](readme-images/connect-via-winscp-01.png)

![My Image](readme-images/connect-via-winscp-02.png)

![My Image](readme-images/connect-via-winscp-03.png)

![My Image](readme-images/connect-via-winscp-04.png)

![My Image](readme-images/connect-via-winscp-05.png)

![My Image](readme-images/connect-via-winscp-06.png)

![My Image](readme-images/connect-via-winscp-07.png)

![My Image](readme-images/connect-via-winscp-08.png)

![My Image](readme-images/connect-via-winscp-09.png)

![My Image](readme-images/connect-via-winscp-10.png)

![My Image](readme-images/connect-via-winscp-11.png)

![My Image](readme-images/connect-via-winscp-12.png)

![My Image](readme-images/connect-via-winscp-13.png)

![My Image](readme-images/connect-via-winscp-14.png)

![My Image](readme-images/connect-via-winscp-15.png)

![My Image](readme-images/connect-via-winscp-16.png)

![My Image](readme-images/connect-via-winscp-17.png)


DELETE AWS EC2
--------------

Link:
* https://console.aws.amazon.com/

![My Image](readme-images/delete-ec2-01.png)

![My Image](readme-images/delete-ec2-02.png)

![My Image](readme-images/delete-ec2-03.png)

![My Image](readme-images/delete-ec2-04.png)

![My Image](readme-images/delete-ec2-05.png)

![My Image](readme-images/delete-ec2-06.png)

![My Image](readme-images/delete-ec2-07.png)

![My Image](readme-images/delete-ec2-08.png)

![My Image](readme-images/delete-ec2-09.png)