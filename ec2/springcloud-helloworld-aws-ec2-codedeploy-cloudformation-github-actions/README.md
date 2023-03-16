USAGE
-----

> **NOTE** This usage assumes that user has created **AWS account** and he/she is connected with this account via **AWS Cli**. User uses also **bash** command line tool (for instance "Git Bash"), not Windows one. Please be aware that all AWS elements will be installed in zone **us-east-1**.

Steps:
1. Create AWS EC2 using CloudFormation stack with `./scripts/cloudformation/ec2/create-ec2-stack.sh`
1. Create AWS CodeDeploy using CloudFormation stack with `./scripts/cloudformation/codedeploy/create-codedeploy-stack.sh`
1. Create AWS S3 bucket with `./scripts/s3/create-s3.sh`
1. Create AWS IAM user for Github Actions S3. Please check section **CONFIGURATION AIM S3**
1. Create AWS IAM user for Github Actions Code Deploy. Please check section **CONFIGURATION AIM CODE DEPLOY**
1. Configure Github. Please check section **CONFIGURE GITHUB**
1. Verify service HelloWorld via service Gateway with `http://{ec2-public-IPv4-address}:8762`
1. (Optional) Verify service HelloWorld directly with `http://{ec2-public-IPv4-address}:8080`
1. (Optional) Verify service Discovery with `http://{ec2-public-IPv4-address}:8761`
1. Clean up AWS
     * Delete AWS EC2 using CloudFormation stack with `./scripts/cloudformation/ec2/delete-ec2-stack.sh`
     * Delete AWS CodeDeploy using CloudFormation stack with `./scripts/cloudformation/codedeploy/delete-codedeploy-stack.sh`
     * Delete AWS S3 with `./scripts/s3/delete-s3.sh`
     * Delete AWS IAM user for Github Actions Code Deploy
     * Delete AWS IAM user for Github Actions S3


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to deploy **microservices** on **AWS** cloud service type **EC2**. These microservices are created in **Java** programming language with usage **Spring Boot Cloud** framework. Docker images of these microservices are built with usage **docker compose** tool. Configuration of AWS EC2 is done by **AWS Code Deploy** and **AWS Cloud Formation**. Using **Github Actions** project is automatically updated on AWS after every push to repository.

AWS Code Deploy takes code from AWS S3 as ZIP package and deploys it on AWS EC2. Endpoint for deployment is file **appspec.yml** (copies resources from package to AWS EC2) and this file redirects action to file **install.sh** (installation resources on AWS EC2).

AWS Cloud Formation enables to create AWS elements from command line via AWS Cli. Elements are created as so called "stacks".

##### Services
This project consists of following services:
* **Service Discovery**: port **8761**. This service contains information about all services registered in the system. Main tasks:
     * **Checking status**: this service can be used to check status of services in the system 
     * **Load balancing**: this service can be used by load balancers to identify services and their instances in the system
* **Service Gateway**: port **8762**. This service redirects traffic from outside system to inside system. Main tasks:
     * **Redirecting**: this service can redirect requests from outside system to some services inside system
     * **Load balancing**: this service can take care of load balancing requests from outside system to services inside system basing on information from service Discovery
* **Service HelloWorld**: port **8080**. This service provides message, port and uuid

##### Flow
The following flow takes place in this project:
1. User via Browser sends request to Service Gateway for content
1. Service Gateway sends request to Service HelloWorld for content
1. Service HelloWorld sends back response to Service Gateway with message, port and uuid
1. Service Gateway sends back response to User via Browser with message, port and uuid

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


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)
* Installed **AWS Cli**. Please check section **INSTALL AWS CLI**
* Installed **bash** command line tool (for instance "Git Bash")

##### Preconditions - Actions
* Created AWS account 
* Created IAM user with EC2 permissions. Please check section **CONFIGURATION AWS ACCOUNT**


CONFIGURE AIM S3
----------------

AWS Console:
* https://console.aws.amazon.com/

![My Image](readme-images/aim-01.png)

![My Image](readme-images/aim-02.png)

![My Image](readme-images/aim-03.png)

![My Image](readme-images/aim-04.png)

![My Image](readme-images/aim-05.png)

![My Image](readme-images/aim-06.png)

![My Image](readme-images/aim-07.png)

![My Image](readme-images/aim-08.png)

![My Image](readme-images/aim-09.png)

![My Image](readme-images/aim-10.png)

![My Image](readme-images/aim-11.png)

![My Image](readme-images/aim-12.png)


CONFIGURE AIM CODE DEPLOY
-------------------------

AWS Console:
* https://console.aws.amazon.com/

![My Image](readme-images/aim-codedeploy-01.png)

![My Image](readme-images/aim-codedeploy-02.png)

![My Image](readme-images/aim-codedeploy-03.png)

![My Image](readme-images/aim-codedeploy-04.png)

![My Image](readme-images/aim-codedeploy-05.png)

![My Image](readme-images/aim-codedeploy-06.png)

![My Image](readme-images/aim-codedeploy-07.png)

![My Image](readme-images/aim-codedeploy-08.png)

![My Image](readme-images/aim-codedeploy-09.png)

![My Image](readme-images/aim-codedeploy-10.png)

![My Image](readme-images/aim-codedeploy-11.png)

![My Image](readme-images/aim-codedeploy-12.png)


CONFIGURE GITHUB
----------------

Link:
* https://www.github.com

```
name: Upload Zip To S3

on:
  push:
    branches:
    - main

jobs:
  
   zip-and-deploy-to-s3:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout 
        uses: actions/checkout@v3
        
      - name: Make artifact directory
        run: mkdir -p ./artifacts
      
      - name: Create Zip
        run: zip -r -q ./artifacts/helloworld-app.zip . -x '*.git*' -x '*.github*' -x 'artifacts/*' -x 'readme-images/*' -x 'README.md'

      - name: Push Zip to S3
        uses: jakejarvis/s3-sync-action@master
        with:
          args: --acl public-read --follow-symlinks --delete --exclude '.git*/*'
        env:
          SOURCE_DIR: './artifacts'
          AWS_REGION: 'us-east-1'
          AWS_S3_BUCKET: ${{ secrets.AWS_S3_BUCKET }}
          AWS_ACCESS_KEY_ID: ${{ secrets.AWS_ACCESS_KEY_ID }}
          AWS_SECRET_ACCESS_KEY: ${{ secrets.AWS_SECRET_ACCESS_KEY }}
 
   run-codedeploy-in-aws:
    runs-on: ubuntu-latest
    needs: zip-and-deploy-to-s3
    steps:
      - name: Deploy the app
        run: |
            aws deploy create-deployment \
            --region us-east-1 \
            --application-name helloworld-codedeploy-application \
            --deployment-group-name helloworld-dev \
            --s3-location bucket=helloworld-s3,key=helloworld-app.zip,bundleType=zip
        env:
          AWS_ACCESS_KEY_ID: ${{ secrets.AWS_DEPLOY_ACCESS_KEY_ID }}
          AWS_SECRET_ACCESS_KEY: ${{ secrets.AWS_DEPLOY_SECRET }}
          AWS_DEFAULT_REGION: us-east-1
```

![My Image](readme-images/github-01.png)

![My Image](readme-images/github-02.png)

![My Image](readme-images/github-03.png)

![My Image](readme-images/github-04.png)

![My Image](readme-images/github-05.png)

![My Image](readme-images/github-06.png)

![My Image](readme-images/github-07.png)

![My Image](readme-images/github-08.png)

![My Image](readme-images/github-09.png)

![My Image](readme-images/github-10.png)

![My Image](readme-images/github-11.png)

![My Image](readme-images/github-12.png)

![My Image](readme-images/github-13.png)

![My Image](readme-images/github-14.png)

![My Image](readme-images/github-15.png)

![My Image](readme-images/github-16.png)


CONFIGURATION AWS ACCOUNT
-------------------------

![My Image](readme-images/account-01.png)

![My Image](readme-images/account-02.png)

![My Image](readme-images/account-03.png)

![My Image](readme-images/account-04.png)

![My Image](readme-images/account-05.png)

![My Image](readme-images/account-06.png)

![My Image](readme-images/account-07.png)

![My Image](readme-images/account-08.png)

![My Image](readme-images/account-09.png)

![My Image](readme-images/account-10.png)

![My Image](readme-images/account-11.png)

![My Image](readme-images/account-12.png)


INSTALL AWS CLI
---------------

![My Image](readme-images/cli-01.png)

![My Image](readme-images/cli-02.png)

![My Image](readme-images/cli-03.png)

![My Image](readme-images/cli-04.png)

![My Image](readme-images/cli-05.png)

![My Image](readme-images/cli-06.png)

![My Image](readme-images/cli-07.png)

![My Image](readme-images/cli-08.png)

![My Image](readme-images/cli-09.png)

![My Image](readme-images/cli-10.png)

![My Image](readme-images/cli-11.png)