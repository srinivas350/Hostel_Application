FROM openjdk:11
EXPOSE 2022
COPY target/hostelapplication.jar hostelapplication.jar
ENTRYPOINT ["java","-jar","/hostelapplication.jar"]