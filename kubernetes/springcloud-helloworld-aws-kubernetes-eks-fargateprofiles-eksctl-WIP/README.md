USAGE
-----

> **NOTE** Please use **bash** command line tool (for instance Github Bash) to run commands below.

Steps:
1. Create AWS EKS cluster with `eksctl create cluster --name helloworld-eks --region us-east-2 --fargate`
1. Install Ingress Controller type Nginx using tool helm with `helm upgrade --install ingress-nginx ingress-nginx --repo https://kubernetes.github.io/ingress-nginx --namespace ingress-nginx --create-namespace`
1. (Optional) Verify Ingress Controller type Nginx with `kubectl get service ingress-nginx-controller --namespace=ingress-nginx`
1. Create Kubernetes nodes with `kubectl apply -f https://raw.githubusercontent.com/wisniewskikr/chrisblog-it-aws/main/kubernetes/springcloud-helloworld-aws-kubernetes-eks-nodegroups-ingress-nginx-eksctl/kubernetes.yaml`
1. Check Ingress Load Balancer address with (column "ADDRESS" - it can take few minutes) `kubectl get ingress`
1. Verify project with **curl {address}**. For instance `curl a72147fbb8d9a445fa7beae3cd09f336-389356373.us-east-2.elb.amazonaws.com`
1. Clean up AWS
     * Delete AWS EKS cluster with `eksctl delete cluster --name helloworld-eks --region us-east-2`


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to deploy **microservices** on **AWS** cloud service type **EKS Fargate Profiles** using tool **eksctl**. Moreover instead of default AWS Load Balancer this project presents how to use Load Balancer type **Ingress Nginx**. Microservices are created in **Java** programming language with usage **Spring Boot Cloud** framework. 

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
* **kubectl**
* **eksctl**: `https://github.com/wisniewskikr/chrisblog-it-aws/tree/main/kubernetes/springcloud-helloworld-aws-kubernetes-eks-nodegroups-eksctl`
* **helm**


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)
* Installed **eksctl** (tested on version 0.132.0)
* Installed **kubectl** (tested on version  v4.5.4)
* Installed **helm** (tested on version v3.9.0-rc.1)


##### Preconditions - Actions
* Created AWS account