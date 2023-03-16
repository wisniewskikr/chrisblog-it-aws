#!/bin/bash

BUCKET=helloworld-s3

aws s3api create-bucket \
    --bucket $BUCKET \
    --region us-east-1 \
   
aws s3api put-public-access-block \
    --bucket $BUCKET \
    --public-access-block-configuration "BlockPublicAcls=false,IgnorePublicAcls=false,BlockPublicPolicy=false,RestrictPublicBuckets=false"

aws s3api put-bucket-encryption --bucket $BUCKET --server-side-encryption-configuration '{
    "Rules": [
        {
            "ApplyServerSideEncryptionByDefault": {
                "SSEAlgorithm": "AES256"
            },
            "BucketKeyEnabled": true
        }
    ]
}'