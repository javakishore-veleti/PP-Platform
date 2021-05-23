#!/bin/bash
CURR_DIR=$(dirname $0)

mkdir -p /tmp/provider-portal/platform/spring-registry-server
# 
java -jar ${CURR_DIR}/target/PP-Platform-Spring-Registry-Server-0.0.1-SNAPSHOT.jar > /tmp/provider-portal/platform/spring-registry-server/Platform-Spring-Registry-Server.log 2>&1 &
