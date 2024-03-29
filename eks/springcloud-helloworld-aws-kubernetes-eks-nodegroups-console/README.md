USAGEUSAGE
-----

> **NOTE** Please use any command line tool to run commands below.

Steps:
1. Create AWS EKS cluster. Please check secction **CONFIGURE AWS EKS CLUSTER**
1. Create AWS EKS Node Groups. Please check section **CONFIGURE AWS EKS NODE GROUPS**
1. Create Kubernetes Pod and Service type Load Balancer using Console. Please check section **USE CONSOLE - NODE PORT**
    * Connect with AWS STS with `aws sts get-caller-identity`
    * Update local kubeconfig file with `aws eks update-kubeconfig --region us-east-2 --name helloworld-eks`
    * Create Kubernetes nodes with `kubectl apply -f ./kubernetes-nodeport.yaml`
    * (Optional) Check if PODs are running with `kubectl get pods`
    * Get EXTERNAL-IP of Node with with `kubectl get nodes -o wide`
    * Get PORT of Service "helloworld-service" with `kubectl get svc`
    * Verify microservice with **curl {EXTERNAL-IP}:{PORT}**. For instance `curl ...`
1. Create Kubernetes Pod and Service type Load Balancer using Console. Please check section **USE CONSOLE - LOAD BALANCER**
    * Connect with AWS STS with `aws sts get-caller-identity`
    * Update local kubeconfig file with `aws eks update-kubeconfig --region us-east-2 --name helloworld-eks`
    * Create Kubernetes nodes with `kubectl apply -f ./kubernetes-loadbalancer.yaml`
    * (Optional) Check if PODs are running with `kubectl get pods`
    * Get external ip for service "helloworld-service" with `kubectl get svc`
    * (Optional) Check DNS with **nslookup {EXTERNAL-IP}**. For instance `nslookup a580e1a8922a541c78c54920032fb658-282970723.us-east-2.elb.amazonaws.com`
    * Verify microservice with **curl {EXTERNAL-IP}**. For instance `curl a580e1a8922a541c78c54920032fb658-282970723.us-east-2.elb.amazonaws.com`


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to deploy **microservices** on **AWS** cloud service type **EKS Node Groups** using **AWS Console**. These microservices are created in **Java** programming language with usage **Spring Boot Cloud** framework. 

There are two types AWS EKS:
* **Node Group (recommended)**: Kubernetes Nodes are created in **AWS EC2**. This type supports default AWS Load Balancer. Other Load Balancers - like Ingress Nginx - can be used additionally.
* **Fargete Profile**: Kubernetes Nodes are created in **AWS ECS**. This type doesn't support default AWS Load Balancer. Other Load Balancers - like Ingress Nginx - have to be used.

Kubernetes services can be deployed on AWS EKS in two ways:
* **Console + AWS Cli**: Kubernates Cluster is created in AWS Console and services are deployed via AWS Cli
* **eksctl + AWS Cli (recommended)**: Kubernates Cluster is created via eksctl and services are deployed via AWS Cli

##### Services
This project consists of following services:
* **Service HelloWorld**: port **8080**. This service provides message, port and uuid

##### Flow
The following flow takes place in this project:
1. User via Curl sends request to Service HelloWorld for content
1. Service HelloWorld sends back response to User via Curl with message, port and uuid

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.

##### Technologies
This project uses following technologies:
* **Java**: `https://docs.google.com/document/d/119VYxF8JIZIUSk7JjwEPNX1RVjHBGbXHBKuK_1ytJg4/edit?usp=sharing`
* **Maven**: `https://docs.google.com/document/d/1cfIMcqkWlobUfVfTLQp7ixqEcOtoTR8X6OGo3cU4maw/edit?usp=sharing`
* **Git**: `https://docs.google.com/document/d/1Iyxy5DYfsrEZK5fxZJnYy5a1saARxd5LyMEscJKSHn0/edit?usp=sharing`
* **Spring Boot**: `https://docs.google.com/document/d/1mvrJT5clbkr9yTj-AQ7YOXcqr2eHSEw2J8n9BMZIZKY/edit?usp=sharing`
* **Microservices**: `https://docs.google.com/document/d/1j_lwf5L0-yTPew75RIWcA6AGeAnJjx0M4Bk4DrUcLXc/edit?usp=sharing`
* **Docker**: `https://docs.google.com/document/d/1tKdfZIrNhTNWjlWcqUkg4lteI91EhBvaj6VDrhpnCnk/edit?usp=sharing`
* **Docker Compose**: `https://docs.google.com/document/d/1SPrCS5OS_G0je_wmcLGrX8cFv7ZkQbb5uztNc9kElS4/edit?usp=sharing`
* **AWS**
* **AWS CLI**
* **kubectl**


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)
* Installed **AWS CLI** (tested on version 2.9.22)


##### Preconditions - Actions
* Created AWS account 


CONFIGURE AWS EKS CLUSTER
-------------------------

AWS link:
* https://console.aws.amazon.com/

![My Image](readme-images/eks-cluster-01.png)

![My Image](readme-images/eks-cluster-02.png)

![My Image](readme-images/eks-cluster-03.png)

![My Image](readme-images/eks-cluster-04.png)

![My Image](readme-images/eks-cluster-05.png)

![My Image](readme-images/eks-cluster-06.png)

![My Image](readme-images/eks-cluster-07.png)

![My Image](readme-images/eks-cluster-08.png)

![My Image](readme-images/eks-cluster-09.png)

![My Image](readme-images/eks-cluster-10.png)

![My Image](readme-images/eks-cluster-11.png)

![My Image](readme-images/eks-cluster-12.png)

![My Image](readme-images/eks-cluster-13.png)

![My Image](readme-images/eks-cluster-14.png)

![My Image](readme-images/eks-cluster-15.png)

![My Image](readme-images/eks-cluster-16.png)

![My Image](readme-images/eks-cluster-17.png)

![My Image](readme-images/eks-cluster-18.png)


CONFIGURE AWS EKS NODE GROUPS
-----------------------------

AWS link:
* https://console.aws.amazon.com/

![My Image](readme-images/eks-rolenode-01.png)

![My Image](readme-images/eks-rolenode-02.png)

![My Image](readme-images/eks-rolenode-03.png)

![My Image](readme-images/eks-rolenode-04.png)

![My Image](readme-images/eks-rolenode-05.png)

![My Image](readme-images/eks-rolenode-06.png)

![My Image](readme-images/eks-rolenode-07.png)

![My Image](readme-images/eks-rolenode-08.png)

![My Image](readme-images/eks-rolenode-09.png)

![My Image](readme-images/eks-rolenode-10.png)

![My Image](readme-images/eks-rolenode-11.png)

![My Image](readme-images/eks-rolenode-12.png)

![My Image](readme-images/eks-rolenode-13.png)

![My Image](readme-images/eks-rolenode-14.png)

![My Image](readme-images/eks-rolenode-15.png)

![My Image](readme-images/eks-rolenode-16.png)

![My Image](readme-images/eks-rolenode-17.png)

![My Image](readme-images/eks-rolenode-18.png)

![My Image](readme-images/eks-rolenode-19.png)

![My Image](readme-images/eks-rolenode-20.png)

![My Image](readme-images/eks-rolenode-21.png)

![My Image](readme-images/eks-rolenode-22.png)


USE CONSOLE - NODE PORT
-----------------------

![My Image](readme-images/console-nodeport-01.png)


USE CONSOLE - LOAD BALANCER
---------------------------

![My Image](readme-images/console-loadbalancer-01.png)