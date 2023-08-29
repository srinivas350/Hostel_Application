FROM openjdk:11
EXPOSE 2022
COPY target/hostelapplication.jar hostelapplication.jar
ENTRYPOINT ["java","-jar","/hostelapplication.jar"]

 # Oracle configuration
  - spring.datasource.url=jdbc:oracle:thin:@//localhost:1521:xe
  - spring.datasource.username=system
  - spring.datasource.password=manager
  - spring.datasource.testWhileIdle=true
  - spring.datasource.validationQuery=SELECT 1
  - spring.jpa.show-sql=true
  - spring.jpa.hibernate.ddl-auto=create-drop
