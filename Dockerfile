# Use an official OpenJDK runtime as a parent image
FROM openjdk:latest

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Compile the Java program
RUN javac SumOfSmallestAndLargest.java

# Run the Java program
CMD ["java", "SumOfSmallestAndLargest"]

