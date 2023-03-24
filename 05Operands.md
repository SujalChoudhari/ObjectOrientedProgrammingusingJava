# Operators

First, four integer variables are declared and initialized with values: 
`int a=0,b=3,c=4,d=10;`. A boolean variable `temp` is also declared.
```java
int a=0,b=3,c=4,d=10;
boolean temp;
```

## Assignment Operators:

`a = b;` assigns the value of b to a, while `c += d;` is shorthand for `c = c + d;`, and assigns the sum of c and d to c.
```java
// Assignment Operators
a = b;
c += d;

```

## Arithmetic Operators: 

`b++;` increments the value of b by 1, while `c--;` decrements the value of c by 1. `a = b *c;` multiplies the values of b and c, and assigns the result to a.
```java
// Arithmetic Operators
b++; 
c--;
a = b *c;

```

## Comparison Operators: 

`temp = (a == b);` compares the values of `a` and `b`, and assigns `true` to `temp` if they are equal, otherwise `false`. `temp = (a <= b);` compares the values of `a` and `b`, and assigns `true` to `temp` if `a` is less than or equal to `b`, otherwise `false`.
```java
// Comparison Operators
temp = (a == b);
temp = (a <=b);

```

## Logical Operators: 

`temp = (a != b);` compares the values of `a` and `b`, and assigns `true` to `temp` if they are not equal, otherwise `false`. `temp = (true || false);` performs a logical OR operation between `true` and `false`, and assigns the result to `temp`. `temp = (true && false);` performs a logical AND operation between `true` and `false`, and assigns the result to `temp`.
```java
// Logical Operators
temp = (a != b);
temp = (true || false);
temp = (true && false);

```

## Bitwise Operators: 

`a = b & c;` performs a bitwise AND operation between `b` and `c`, and assigns the result to `a`. `d = c | d;` performs a bitwise OR operation between `c` and `d`, and assigns the result to `d`.
```java
// Bitwise Operators
a = b & c;
d = c | d; 

```

## Precedence and Associativity: 

`i++` increments the value of `i` by 1, but returns the original value of `i`. `++i` increments the value of `i` by 1, and returns the new value of `i`. The code shows how the increment operators are applied and how their values are printed on the console.
```java
// Precedence and Associativity
// Runs Left to right. * and / are prioritized over + and -


// Increment Operators;
int i = 10;				// i  | display
System.out.println(i); 	// 10 | 10
System.out.println(i++);// 11 | 10
System.out.println(i);	// 11 | 11
System.out.println(++i);// 12 | 12


```