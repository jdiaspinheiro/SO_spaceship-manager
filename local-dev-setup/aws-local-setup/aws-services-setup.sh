#!/bin/sh

echo "creating sqs queue : source-queue.."
awslocal sqs create-queue --queue-name=gdspsimadapter-queue --region us-east-1
awslocal sqs create-queue --queue-name=simcallback-queue --region us-east-1

echo "creating sns topic : destination-topic.."
awslocal sns create-topic --name outbound-topic --region us-east-1

############################################################
# If you would like to execute this script manually then
# comment the above section and uncomment the below section
#############################################################
#echo "creating sqs queue : source-queue.."
#aws --endpoint-url=http://localhost:4566 sqs create-queue --queue-name=inbound-queue --region us-east-1
#
#echo "creating sns topic : destination-topic.."
#aws --endpoint-url=http://localhost:4566 sns create-topic --name outbound-topic --region us-east-1
