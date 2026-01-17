# ⚙️ Operators in Java

Operators are special symbols used to perform operations on variables and values.

Java operators are used for:
- Calculations
- Comparisons
- Logical decisions
- Value assignments

---

## 📌 Types of Operators in Java

1. Arithmetic Operators
2. Relational (Comparison) Operators
3. Logical Operators
4. Assignment Operators
5. Unary Operators
6. Bitwise Operators
7. Ternary Operator

---

## 1️⃣ Arithmetic Operators

Used to perform mathematical operations.

| Operator | Description |
|--------|------------|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Modulus |

📌 Example:
```java
int a = 10, b = 3;
System.out.println(a + b);
2️⃣ Relational Operators

Used to compare two values. Result is boolean.

Operator	Meaning
==	Equal to
!=	Not equal
>	Greater than
<	Less than
>=	Greater than or equal
<=	Less than or equal
3️⃣ Logical Operators

Used to combine boolean expressions.

Operator	Meaning
&&	Logical AND
	
!	Logical NOT
4️⃣ Assignment Operators

Used to assign values.

Operator	Example
=	a = 10
+=	a += 5
-=	a -= 3
*=	a *= 2
/=	a /= 2
5️⃣ Unary Operators

Operate on a single operand.

Operator	Meaning
+	Unary plus
-	Unary minus
++	Increment
--	Decrement
!	Logical NOT
6️⃣ Bitwise Operators (Intro)

Used to perform operations on bits.

Operator	Name
&	AND
	
^	XOR
~	NOT
<<	Left Shift
>>	Right Shift
7️⃣ Ternary Operator

Short form of if-else.

📌 Syntax:

condition ? value1 : value2;


📌 Example:

int max = (a > b) ? a : b;