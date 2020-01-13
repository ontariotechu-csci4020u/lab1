# Lab: basic Java development and testing

# Introduction

In this lab, we will familarize ourselves the development and testing environment by implementating a very simple Java project.

The Java program is for storing and printing student records, and course enrollment.

## Java class

You need to implement a `Student` class with at least the following methods.

```java
public class Student {
  /* Constructs a student record with name and student number. */
  public Student(String name, String number) throws Exception;
  
  /* Get the student number */
  public String getNumber();
  
  /* Get the student name */
  public String getName();
  
  /* Print the student record */
  public void print();
}
```

The Java class `Course` has a name, and can hold multiple students.

```java
pulic class Course {
  /* Construct a course. */
  public Course(String name) throws Exception;
  
  /* Find the name of a student by their number */
  public String find(String number);
  
  /* Enroll a student into the course */
  public void enroll(String name, String number) throws Exception;
  
  /* Prints the course and students */
  public void print();
}
```

# Assignment

You are to implement the two Java classes based on the templates provided in the Git repo.

The repository has the following structure:

```
.
|-- Makefile
|-- README.md
|-- reference.json
`-- src
    |-- Course.java
    |-- Main.java
    `-- Student.java
```

The `Makefile` helps you to compile the Java files.  There are two targets:

- `compile`:
  Compiles the Java files
  
- `run`:
  Runs the `Main class`.
  
The `.java` files are skeletons of the described classes.  Your job is to implement the empty methods.

Finally, the `reference.json` file contains several execution code paths, and their reference behaviour.  This will be used to assess the correctness of your code.  More information will be given during the lab sessions.
