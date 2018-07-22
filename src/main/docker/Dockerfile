FROM openjdk

VOLUME /tmp
ADD maven/springdockerfabric8sample-0.0.3-SNAPSHOT.jar myapp.jar
RUN sh -c 'touch /myapp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/mvn -versiondev/./urandom","-jar","/myapp.jar"]