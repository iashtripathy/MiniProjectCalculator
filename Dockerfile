FROM openjdk:8
COPY target/Calculator-1.0-SNAPSHOT.jar Calculator-1.0-SNAPSHOT.jar
CMD ["java","-cp","Calculator-1.0-SNAPSHOT.jar", "Calculator"]