#!/bin/bash

cd /home/ec2-user

sudo chmod +x ./service-discovery/mvnw
sudo chmod +x ./service-gateway/mvnw
sudo chmod +x ./service-helloworld/mvnw

docker-compose stop;
docker-compose rm -f;
docker-compose up -d --build