# Use the official Tomcat 10.1 image
FROM tomcat:10.1

# Set working directory inside the container
WORKDIR /usr/local/tomcat/webapps/

# Copy WAR file to Tomcat's webapps directory
COPY target/myapp.war myapp.war

# Expose port 8080 (default for Tomcat)
EXPOSE 8080

# Start Tomcat server
CMD ["catalina.sh", "run"]
