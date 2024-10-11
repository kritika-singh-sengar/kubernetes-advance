# First stage 
FROM maven:3.8.6-openjdk-11-slim AS builder
ADD . /project
RUN mvn -f /project/pom.xml -DskipTests package


# Second stage
FROM openjdk:11-jre-slim
# Copy only the Jar from the "builder" stage
COPY --from=builder /project/target/teacher.jar teacher.jar

# Run the Jar = Final image only containers Second stage
ENTRYPOINT ["java","-jar","/teacher.jar"]