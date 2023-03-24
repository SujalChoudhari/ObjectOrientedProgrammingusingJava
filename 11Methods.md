# Methods
In Java, a method is a block of code that performs a specific task and can be invoked (called) from other parts of the program. Methods are used to organize code, make it more reusable, and reduce code duplication.

A method can take inputs (parameters) and return a value, or it can take no inputs and have no return value. In Java, a method is declared using the public access modifier (or other access modifiers), followed by the return type, the method name, and the parameter list (if any). The body of the method is enclosed in curly braces {}.

Here is an example of a simple method that takes two integer parameters and returns their sum:

```java
public int sum(int a, int b) {
    int result = a + b;
    return result;
}
```

To invoke (call) this method from another part of the program, we use the method name and provide the arguments (values) for the parameters:

```java
int x = 5;
int y = 7;
int z = sum(x, y); // z will be 12
```


In this example, the method sum takes two integer parameters a and b and returns their sum as an integer value. The method is invoked with the arguments x and y, and the returned value is assigned to the variable z.

Methods can also be used to perform complex calculations or operations, and can be designed to have side effects (such as changing the state of an object) or to throw exceptions when errors occur.

Another example of a method that prints out a message to the console and has no return value is:
```java
public void sayHello(String name) {
    System.out.println("Hello, " + name + "!");
}
```


This method takes a single parameter name of type String and prints out a greeting message to the console. To invoke this method, we call it with the name parameter:
```java
sayHello("John"); // prints "Hello, John!"
```