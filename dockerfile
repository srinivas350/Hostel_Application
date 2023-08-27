FROM openjdk:11
EXPOSE 2022
COPY target/HostelApplication.jar HostelApplication.jar
ENTRYPOINT ["java","-jar","/HostelApplication.jar"]