#!/bin/bash
CURR_DIR=$(dirname $0)

mkdir -p /tmp/provider-portal/platform/spring-config-server
# 
java -jar ${CURR_DIR}/target/PP-Platform-Spring-Config-Server-0.0.1-SNAPSHOT.jar > /tmp/provider-portal/platform/spring-config-server/Platform-Spring-Config-Server.log 2>&1 &
