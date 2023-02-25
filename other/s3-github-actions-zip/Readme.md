USAGE
-----

Steps:
1. Configure AWS IAM. Please check section **CONFIGURATION AIM**
1. Configure AWS S3. Please check section **CONFIGURATION S3**
1. Configure Github Actions. Please check section **CONFIGURATION GITHUB ACTIONS**


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to configure **Github Actions** to deploy **Zip** file to **AWS S3**. On every push to GIT new Zip file with content should be created and pushed to AWS S3.

##### Technologies
This project uses following technologies:
* **Git**: `https://docs.google.com/document/d/1Iyxy5DYfsrEZK5fxZJnYy5a1saARxd5LyMEscJKSHn0/edit?usp=sharing`
* **AWS**


PRECONDITIONS
-------------

##### Preconditions - Tools

##### Preconditions - Actions
* Created AWS account 
* Created IAM user with EC2 permissions. Please check section **CREATE IAM USER**


CONFIGURE AIM
-------------

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


CONFIGURE S3
-------------

AWS Console:
* https://console.aws.amazon.com/

![My Image](readme-images/s3-01.png)

![My Image](readme-images/s3-02.png)

![My Image](readme-images/s3-03.png)

![My Image](readme-images/s3-04.png)

![My Image](readme-images/s3-05.png)

![My Image](readme-images/s3-06.png)


CONFIGURE GITHUB
----------------

Link:
* https://www.github.com

```
name: Upload Zip To S3

on:
  push:
    branches:
    - master

jobs:  
   deploy:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout 
        uses: actions/checkout@v3
        
      - name: Make artifact directory
        run: mkdir -p ./artifacts
      
      - name: Create Zip
        run: zip -r -q ./artifacts/folder.zip . -x '*.git*' -x '*.github*' -x 'artifacts/*'

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