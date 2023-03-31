FROM openjdk:11
COPY ./target/CalculatorApp-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "CalculatorApp-1.0-SNAPSHOT-jar-with-dependencies.jar"]
 
