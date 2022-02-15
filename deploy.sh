#!/bin/bash 

project="samsung.careers"
timestamp=`date +%Y%m%d%H%M`
echo "${project}::${timestamp}"
#printf "%s %s" $project $timestamp

cd /usr/local/tomcat/$project.9.0.58/bin
sudo ./shutdown.sh

if [ -d /var/webapps/$project/ROOT ]; then
    sudo rm -r /var/webapps/$project/ROOT
    echo "remove root directory"
fi

if [ -e /var/webapps/$project/ROOT.war ]; then
    sudo rm -r /var/webapps/$project/back/*
    sudo mv /var/webapps/$project/ROOT.war  /var/webapps/$project/back/$timestamp".war"
    echo "move bak folder"
fi

cd /var/lib/jenkins/workspace/$project
sudo find . -name "*-SNAPSHOT".war -exec cp {} /var/webapps/$project/ROOT.war \;
cd /usr/local/tomcat/samsung.careers.9.0.58/bin
sudo ./startup.sh
