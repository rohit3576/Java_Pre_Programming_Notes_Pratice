# ☕ Introduction to Java

## What is Java?

Java is a **high-level, object-oriented, class-based programming language**.  
It is designed to be **simple, secure, portable, and platform-independent**.

Java follows the principle:

**“Write Once, Run Anywhere (WORA)”**

This means a Java program can run on any system that has a **Java Virtual Machine (JVM)**.

---

## Type of Programming Language

Java is:

- High-level programming language
- Object-Oriented Programming (OOP) language
- Platform-independent language
- Compiled and Interpreted language
- Strongly typed language

---

## Original Name of Java

- Java was originally named **Oak**
- It was developed under the **Green Project**
- Created at **Sun Microsystems**
- The name Oak was changed due to trademark issues
- The new name **Java** was inspired by **Java coffee**

---

## What Can We Write Inside Java?

In Java, everything is written inside a **class**.  
Java provides different building blocks to write programs.

---

### 1️⃣ Class

A **class** is a blueprint or template used to create objects.

- Contains variables and methods
- Every Java program must have at least **one class**

#### Example:
```java
class Student {
    int id;
    String name;
}
2️⃣ Interface
An interface is used to achieve abstraction.

Contains abstract methods

Used to define behavior

Supports multiple inheritance

Example:
java
Copy code
interface Animal {
    void sound();
}
3️⃣ Enum
An enum (enumeration) is used to store a fixed set of constants.

Improves code readability

Used when values are predefined

Example:
java
Copy code
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}
4️⃣ Annotation
An annotation provides metadata about the program.

Does not change program logic

Used by compiler and frameworks

Common annotations:

@Override

@Deprecated

@SuppressWarnings

Example:
java
Copy code
class Demo {
    @Override
    public String toString() {
        return "Annotation Example";
    }
}
First Java Program (Printing Output)
To print output in Java, we use System.out.println().

Example:
java
Copy code
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
Output:
Copy code
Hello, World!