FROM jetty:11.0.25
EXPOSE 8080:8080
COPY ./build/libs/jetty-war.war/ /var/lib/jetty/webapps
WORKDIR /var/lib/jetty
CMD ["java","-jar","/usr/local/jetty/start.jar"]
