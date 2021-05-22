#!/bin/bash
CURR_DIR=$(dirname $0)

mkdir -p /tmp/provider_portal
# 
java -jar ${CURR_DIR}/target/PP-Platform-Spring-Config-Server-0.0.1-SNAPSHOT.jar > /tmp/provider_portal/Platform-Spring-Config-Server.log 2>&1 &
