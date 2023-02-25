#!/bin/bash

BUCKET=helloworld-s3

aws s3api delete-objects \
    --bucket $BUCKET \
    --region us-east-1 \
    --delete "$(aws s3api list-object-versions \
    --bucket "$BUCKET" \
    --output=json \
    --query='{Objects: Versions[].{Key:Key,VersionId:VersionId}}')"

aws s3api delete-bucket \
    --bucket $BUCKET \
    --region us-east-1