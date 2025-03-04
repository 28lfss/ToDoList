# PROCESS TO DOCKERIZE ToDoList_app (need to generate a .jar file)

#FROM openjdk:21-jdk
#LABEL authors="28lfss"
#WORKDIR /
#COPY target/ToDoList-0.0.1-SNAPSHOT.jar app.jar
#EXPOSE 8080
#
#CMD ["java", "-jar", "app.jar"]