FROM openjdk:8
ADD build/libs/SpringBootDocker.jar SpringBootDocker.jar
EXPOSE 8087
ENTRYPOINT ["java","-jar","SpringBootDocker.jar"]