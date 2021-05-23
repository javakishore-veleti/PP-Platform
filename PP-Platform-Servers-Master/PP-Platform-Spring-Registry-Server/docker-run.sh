#!/bin/bash

CURR_DIR=$(dirname $0)

APP_PORT_NO=8761
CONTAINER_NAME="PP-Platform-Spring-Registry-Server"

mkdir -p /tmp/provider-portal/platform/spring-registry-server

docker run -d --name ${CONTAINER_NAME} -p ${APP_PORT_NO}:8761 provider-portal/platform-spring-registry-server > /tmp/provider-portal/platform/spring-registry-server/docker-container.log 2&>1

echo ""
echo "Provider Portal - Platofmr - Spring Registry Server Web URL -> http://localhost:${APP_PORT_NO}"
echo ""
echo "Docker commands are:"
echo "#####################"
echo "docker ps -a 	${CONTAINER_NAME}"
echo "docker stop 	${CONTAINER_NAME}	OR ./docker-stop.sh"
echo "docker rm 	${CONTAINER_NAME}	OR ./docker-remove.sh"
echo ""
