# If Else
In Java, 
`if-else` is a control flow statement used for decision making. It allows a program to execute different code blocks based on different conditions.
Here's an example:
```java
int num = 10;

if (num > 0) {
    System.out.println("Number is positive");
} else if (num < 0) {
    System.out.println("Number is negative");
} else {
    System.out.println("Number is zero");
}
```
In the above example, we have a variable `num` that has been assigned the value `10`. We then use an `if-else if-else` statement to check whether the value of `num` is positive, negative, or zero.

The first condition checks whether `num` is greater than `0`. If the condition is true, it executes the code block inside the `if` statement, which prints "Number is positive" to the console.

If the first condition is false, it moves on to the second condition, which checks whether `num` is less than `0`. If this condition is true, it executes the code block inside the `else if` statement, which prints "Number is negative" to the console.

If both of the above conditions are false, it executes the code block inside the `else` statement, which prints "Number is zero" to the console.

If you are wondering if Java supports nested if else and if else ladders like C, the answer is yes. 
You can write as many layers of conditions as you want, as long as you don't get lost in the curly braces. 

Just remember to use proper indentation and comments, or else your code will look like a mess. 
And don't forget to close all your parentheses, or else you will get a syntax error. Java is very picky about that.
