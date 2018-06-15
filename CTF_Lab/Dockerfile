FROM frolvlad/alpine-oraclejdk8:slim
ADD target/ticketmagpie-0.1.0.jar .
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ticketmagpie-0.1.0.jar"]
