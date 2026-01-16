# 📦 Variables and Data Types in Java

In Java, **variables** are used to store data, and **data types** define what kind of data a variable can hold.  
Java is a **strongly typed language**, which means every variable must have a data type.

---

## 📌 What is a Variable?

A **variable** is a container used to store values in memory.

### Syntax:
```java
dataType variableName = value;
Example:
int age = 21;

---
📌 Types of Variables in Java

Java has three main types of variables:

1️⃣ Local Variables
2️⃣ Instance Variables
3️⃣ Static Variables

1️⃣ Local Variables

Declared inside a method

Accessible only within that method

Must be initialized before use

Example:
class LocalVariableExample {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);
    }
}

2️⃣ Instance Variables

Declared inside a class but outside methods

Each object has its own copy

Example:
class InstanceVariableExample {
    int count = 5;

    public static void main(String[] args) {
        InstanceVariableExample obj = new InstanceVariableExample();
        System.out.println(obj.count);
    }
}

3️⃣ Static Variables

Declared using the static keyword

Shared among all objects

Example:
class StaticVariableExample {
    static int total = 100;

    public static void main(String[] args) {
        System.out.println(total);
    }
}
---

📊 Data Types in Java

Java has two categories of data types:

1️⃣ Primitive Data Types
2️⃣ Non-Primitive Data Types

1️⃣ Primitive Data Types

Primitive data types store simple values.

Data Type	Size	Example
byte	1 byte	10
short	2 bytes	100
int	4 bytes	1000
long	8 bytes	100L
float	4 bytes	3.14f
double	8 bytes	9.81
char	2 bytes	'A'
boolean	1 bit	true
Example:
class PrimitiveExample {
    public static void main(String[] args) {
        int age = 21;
        float price = 99.99f;
        char grade = 'A';
        boolean isLearning = true;

        System.out.println(age);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(isLearning);
    }
}

2️⃣ Non-Primitive Data Types

Non-primitive data types store references.

Examples:

String

Arrays

Classes

Interfaces

Example:
class NonPrimitiveExample {
    public static void main(String[] args) {
        String name = "Rohit";
        int[] marks = {80, 85, 90};

        System.out.println(name);
        System.out.println(marks[0]);
    }
}

🆚 Difference Between Primitive and Non-Primitive
Feature	Primitive	Non-Primitive
Stores	Value	Reference
Size	Fixed	Variable
Can be null	❌ No	✅ Yes
Examples	int, char	String, Array