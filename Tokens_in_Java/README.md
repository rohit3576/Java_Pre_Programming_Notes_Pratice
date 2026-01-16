# 🔤 Tokens in Java

In Java, a **token** is the smallest individual unit of a program.  
The Java compiler breaks a program into tokens to understand and execute it.

👉 **Without tokens, Java code cannot be compiled.**

---

## 📌 Types of Tokens in Java

Java has **5 main types of tokens**:

1. Keywords  
2. Identifiers  
3. Literals  
4. Operators  
5. Separators  

---

## 1️⃣ Keywords

**Keywords** are reserved words in Java with a predefined meaning.

- Cannot be used as variable names
- Written in lowercase
- Java has **50+ keywords**

### Examples:
class, public, static, void, int, if, else, return, new


### Example Code:
```java
class KeywordExample {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);
    }
}

---
2️⃣ Identifiers

Identifiers are names given to:

Variables

Classes

Methods

Objects

Rules:

Must start with a letter, _, or $

Cannot start with a number

Cannot be a keyword

Case-sensitive

Examples:

✅ Valid:

age, studentName, _count, $salary


❌ Invalid:

1number, class, int
----
3️⃣ Literals

Literals are fixed values assigned to variables.

Types of Literals:

Integer: 10, 100

Floating-point: 3.14, 9.8

Character: 'A'

String: "Java"

Boolean: true, false

Example:
class LiteralExample {
    public static void main(String[] args) {
        int age = 21;
        float pi = 3.14f;
        char grade = 'A';
        String language = "Java";
        boolean isFun = true;
    }
}
---
4️⃣ Operators

Operators are symbols used to perform operations.

Common Operators:

Arithmetic: + - * / %

Relational: == != > < >= <=

Logical: && || !

Assignment: = += -=

Example:
class OperatorExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(a + b);
    }
}
---
5️⃣ Separators

Separators are symbols used to separate code elements.

Examples:
( )  { }  [ ]  ;  ,  .

Example:
class SeparatorExample {
    public static void main(String[] args) {
        System.out.println("Separators help structure code");
    }
}

🧠 Example Showing All Tokens Together
class TokenDemo {
    public static void main(String[] args) {
        int score = 90;
        System.out.println("Score = " + score);
    }
}

Tokens Used:

Keywords → class, public, static, void, int

Identifier → score

Literal → 90, "Score = "

Operator → =, +

Separator → { } ( ) ;