# 🖨️ Printing Statements in Java

Printing output is one of the most basic and important operations in Java.  
Java provides different methods to display output on the console.

---

## 1️⃣ print()

The `print()` method prints output **on the same line**.

### Example:
```java
package Printing_Statements;

class PrintExample {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.print(" Java");
    }
}
---
Output:
Hello Java

🔹 Key Point:
The next output continues on the same line.

---
📌 2. println() Method

The println() method prints output and then moves the cursor to the next line.

Example:
class PrintlnExample {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Java");
    }
}

Output:
Hello
Java


🔹 Key Point:
A new line is added automatically after printing.
---
📌 3. printf() Method

The printf() method is used for formatted output.
It allows you to insert values into a formatted string using format specifiers.

Example:
class PrintfExample {
    public static void main(String[] args) {
        System.out.printf("My name is %s and I am %d years old", "Rohit", 21);
    }
}

Output:
My name is Rohit and I am 21 years old

📊 Common Format Specifiers
Specifier	Meaning
%s	String
%d	Integer
%f	Floating-point number
%c	Character
%b	Boolean
🔁 New Line in printf()

Unlike println(), printf() does not add a new line automatically.
To move to a new line, use \n.

Example:
System.out.printf("Java\nProgramming");

Output:
Java
Programming