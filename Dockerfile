FROM openjdk:17
MAINTAINER habib
COPY target/aws-ecs-demo.jar aws-ecs-demo.jar
ENTRYPOINT ["java", "-jar", "aws-ecs-demo.jar"]