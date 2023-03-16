USAGE
-----

> **NOTE** Please use **Windows PowerShell** command line tool as **administrator**.

Steps:
1. Install tool **chocolatey** with `Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))`
1. Install tool **eksctl** using tool chocolatery with `choco install -y eksctl`
1. Test tool **eksctl** with `eksctl version`


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to install **eksctl** on local computer with **Windows** operation system.

Tool eksctl is related to AWS EKS - Kubernetes service for AWS. It enables to manage AWS EKS from the command line of local computer.

##### Services
This project consists of following services:
* N/A

##### Flow
The following flow takes place in this project:
* N/A

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.

##### Technologies
This project uses following technologies:
* N/A


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)