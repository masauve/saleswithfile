FROM jboss-fuse-6/fis-java-openshift:1.0
MAINTAINER docker-maven-plugin@jolokia.org
ENV A_MQ_SERVICE_NAME=broker BROKER_SERVICE_PORT=61616 JAVA_MAIN_CLASS=org.apache.camel.spring.Main JAVA_LIB_DIR=/deployments/lib BROKER_SERVICE_HOST=172.30.125.187 HTTP_PORT=9191
EXPOSE 9191
COPY maven /deployments/
