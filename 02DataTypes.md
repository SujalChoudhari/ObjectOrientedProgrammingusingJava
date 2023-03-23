# Datatypes in Java

If you are a Java programmer, you probably know that there are two types of data types in Java: primitive and non-primitive. But do you know what makes them different? And do you know how to use them properly? If not, don't worry. I'm here to help you with some funny examples and explanations.

Primitive data types are the basic building blocks of Java. They are simple and easy to use, but they have some limitations. For example, they can only store fixed values and they don't have any methods or properties. There are eight primitive data types in Java: boolean, char, byte, short, int, long, float and double.

- boolean: This data type can only store two values: true or false. It's like a coin that can only show heads or tails. You can use it for simple logic operations or to check if something is on or off. For example:
```java
boolean hungry = true; // I'm hungry
boolean full = false; // I'm not full
if (hungry && !full) { // If I'm hungry and not full
  System.out.println("I need food!"); // I need food!
}
```
- char: This data type can store a single character or letter. It's like a Scrabble tile that can only show one letter at a time. You can use it for storing symbols or alphabets. For example:
```java
char grade = 'A'; // I got an A
char symbol = '\$'; // This is a dollar sign
System.out.println("My grade is " + grade); // My grade is A
System.out.println("I want more " + symbol); // I want more $
```
- byte: This data type can store a whole number from -128 to 127. It's like a small bucket that can only hold 8 bits of water. You can use it for saving memory or for low-level operations. For example:
```java
byte age = 25; // I'm 25 years old
byte max = 127; // This is the maximum value of byte
System.out.println("My age is " + age); // My age is 25
System.out.println("The max value of byte is " + max); // The max value of byte is 127
```
- short: This data type can store a whole number from -32,768 to 32,767. It's like a medium bucket that can hold 16 bits of water. You can use it for saving memory or for medium-level operations. For example:
```java
short salary = 5000; // I earn 5000 dollars per month
short min = -32768; // This is the minimum value of short
System.out.println("My salary is " + salary); // My salary is 5000
System.out.println("The min value of short is " + min); // The min value of short is -32768
```
- int: This data type can store a whole number from -2^31 to 2^31-1 (about -2 billion to 2 billion). It's like a large bucket that can hold 32 bits of water. You can use it for most arithmetic operations or for storing numbers without decimals. For example:
```java
int population = 1000000; // There are one million people in this city
int zero = 0; // This is zero
System.out.println("The population of this city is " + population); // The population of this city is 1000000
System.out.println("Zero divided by zero equals " + (zero / zero)); // Zero divided by zero equals NaN (Not a Number)
```
- long: This data type can store a whole number from -2^63 to 2^63-1 (about -9 quintillion to 9 quintillion). It's like an extra large bucket that can hold 64 bits of water. You can use it for very large numbers or for high-level operations. For example:
```java
long distance = 1000000000000L; // The distance from Earth to Mars in meters
long max = Long.MAX_VALUE; // This is the maximum value of long
System.out.println("The distance from Earth to Mars is " + distance); // The distance from Earth to Mars is 
1000000000000L System.out.println("The max value of long 
is " + max); 
// The max value 
// of long 
// is 
// 9223372036854775807
```

* *Float* is a datatype that can store decimal numbers with up to 7 digits of precision. It is like mint chocolate chip ice cream. It is refreshing and cool, but it can also cause some problems if you are not careful. For example, if you try to compare two floats using == operator, you might get unexpected results because of rounding errors. That's why you should always use a small tolerance value when comparing floats.

* *Double* is a datatype that can store decimal numbers with up to 15 digits of precision. It is like cookie dough ice cream. It is rich and satisfying, but it also takes up more space than float. Double uses 64 bits of memory, while float uses 32 bits. That means double can store more accurate values, but it also consumes more resources and slows down your program.

* *Short* is a datatype that can store whole numbers from -32768 to 32767. It is like strawberry ice cream. It is sweet and colorful, but it also has some limitations. Short uses only 16 bits of memory, which makes it efficient and fast, but it also means it can overflow easily if you try to store larger values than its range.

So how do you choose which datatype to use? Well, it depends on your needs and preferences. If you want speed and simplicity, go for int or char. If you want accuracy and flexibility, go for double or float. If you want to save memory and avoid overflow errors, go for short or byte (which is even smaller than short). And if you want to have fun and experiment with different flavors of ice cream... I mean datatypes... then try them all!

```java
//Primitive Data types
byte a = 127;  				// 1 byte
short b = 128; 				// 2 bytes
char g = 'c'; 				// 2 bytes
int c = 1_000_000; 			// 4 bytes
float d = 10.202020f; 		// 4 bytes
long e = 10_000_000_000L; 	// 8 bytes
double i = 10e9; 			// 8 bytes
double f = 1.10100101d; 	// 8 bytes
boolean h = false;			// Depends on JVM
```