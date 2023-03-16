#!/bin/bash

cd /home/ec2-user

sudo mvn clean package -D maven.test.skip;
docker-compose -f docker-compose-fast.yml stop;
docker-compose rm -f;
docker-compose -f docker-compose-fast.yml up -d --build