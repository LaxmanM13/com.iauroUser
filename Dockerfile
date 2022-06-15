 FROM openjdk:11
 EXPOSE 9091
 ADD target/customers.jar customers.jar
 ENTRYPOINT ["java","-jar","customers.jar"]