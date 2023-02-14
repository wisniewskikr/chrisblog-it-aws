#!/bin/bash

aws deploy create-deployment \
--application-name helloworld-codedeploy-application \
--deployment-group-name helloworld-dev \
--s3-location bucket=helloworld-s3,key=springcloud-helloworld-aws-ec2-codedeploy-cloudformation.zip,bundleType=zip