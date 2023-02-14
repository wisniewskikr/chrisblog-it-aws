#!/bin/bash

/C/IT/7-Zip/7z.exe a target/springcloud-helloworld-aws-ec2-codedeploy-cloudformation.zip *

BUCKET=helloworld-s3

aws s3 cp target/springcloud-helloworld-aws-ec2-codedeploy-cloudformation.zip s3://$BUCKET/springcloud-helloworld-aws-ec2-codedeploy-cloudformation.zip