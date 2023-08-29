FROM openjdk:11
EXPOSE 2022
COPY target/hostelapplication.jar hostelapplication.jar
ENTRYPOINT ["java","-jar","/hostelapplication.jar"]

 version: '2'

services:

  oracle:
    image: nexus:5000/spring-boot-example/oracle:1.0
    environment:
     - JAVA_OPTS=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005  -Dcom.sun.management.jmxremote -Djava.rmi.server.hostname=producer -Dcom.sun.management.jmxremote.port=1099 -Dcom.sun.management.jmxremote.rmi.port=1099 -Dcom.sun.management.jmxremote.local.only=false -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false
     - spring.main.web-environment=false
     - spring.profiles.active=test
     - endpoints.jmx.enabled=true
     - endpoints.beans.id=springbeans
     - endpoints.beans.sensitive=false
     - endpoints.beans.enabled=true
#    - spring.application.admin.jmx-port=1099
#    - com.sun.management.jmxremote.port=1099


     # Oracle configuration
      - spring.datasource.url=jdbc:oracle:thin:@//oracle:1521/ORCLPDB1
      - spring.datasource.username=system
      - spring.datasource.password=manager
      - spring.datasource.testWhileIdle=true
      - spring.datasource.validationQuery=SELECT 1
      - spring.jpa.show-sql=true
      - spring.jpa.hibernate.ddl-auto=create-drop
      
    logging:
      options:
        max-size: 50m