FROM openjdk:21-rc-jdk-oraclelinux7 
WORKDIR /home/ted/Applications/binary-data-utils
COPY ./target/binary-data-utils.jar /home/ted/Applications/binary-data-utils
RUN chmod +x /home/ted/Applications/binary-data-utils/binary-data-utils.jar
CMD ["java", "-jar", "/home/ted/Applications/binary-data-utils/binary-data-utils.jar"]

