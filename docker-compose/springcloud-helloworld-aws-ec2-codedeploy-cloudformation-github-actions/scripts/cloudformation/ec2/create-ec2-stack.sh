aws cloudformation create-stack --stack-name helloworld-ec2 --capabilities CAPABILITY_NAMED_IAM --template-body file://scripts/cloudformation/ec2/ec2-stack.yaml --region us-east-1