# Literals
Literals in Java are the values that you can assign to variables or constants. 
They are also known as **"hard-coded"** values because they don't change during the execution of the program. 

For example, 42 is an integer literal, "Hello" is a string literal, and true is a boolean literal. There are different types of literals in Java, such as numeric literals, character literals, string literals, boolean literals, and null literals. 

Some of them have special syntax or rules that you need to follow. For example, you can use underscores to separate digits in numeric literals for readability, such as 1_000_000. 

You can also use prefixes or suffixes to indicate the base or the data type of numeric literals, such as 0b1010 for binary or 3.14f for float. Character literals are enclosed in single quotes and can represent any Unicode character, such as 'A' or '\u0041'. String literals are enclosed in double quotes and can span multiple lines with the help of escape sequences, such as "This is a\nmulti-line string". Boolean literals can only be either true or false and are case-sensitive. Null literal is a special value that represents the absence of an object reference and can only be assigned to reference types.

Literals in Java are very useful and convenient for expressing constant values in your code. However, they can also cause some confusion or errors if you don't use them correctly. For example, if you write 12345678901234567890 as an integer literal without any suffixes, it will cause a compile-time error because it exceeds the range of int data type. If you write 'abc' as a character literal instead of "abc" as a string literal, it will also cause a compile-time error because it contains more than one character. If you write null as a boolean literal instead of false or true , it will cause a run-time error because null cannot be converted to boolean.

Therefore, when using literals in Java , you should always pay attention to their syntax and semantics and make sure they match the data type of the variable or constant that you assign them to. Otherwise , you might end up with some funny but unwanted results.

```java
package com.sujalchoudhari;

public class NOTES_02_Literals {
	public static void main(String[] args) {
		// Any constant value assigned to a variable is a literal.
		/**
		 * 123 		- integer
		 * 123L 	- long
		 * 1.23 	- double (by default)
		 * 1.23f 	- float 
		 * 'A' 		- char
		 * true 	- boolean
		 * "Literal"-String
		 * 
		 */
	}
}
```