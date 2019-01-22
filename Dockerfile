FROM openjdk:11.0.2-jdk-oraclelinux7

COPY target/micro-example-0.0.1-SNAPSHOT.jar /srv/micro-example.jar

CMD ["/usr/bin/java", "-jar", "/srv/micro-example.jar"]