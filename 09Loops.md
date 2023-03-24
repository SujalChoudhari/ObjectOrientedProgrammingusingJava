# Loops

## The For Loop
The `for` loop: The `for` loop is used to execute a block of code repeatedly for a fixed number of times. Here's an example:
```java

for (int i = 0; i < 5; i++) {
    System.out.println("The value of i is: " + i);
}
```
In this example, we start the loop with `int i = 0`, and the loop will continue to execute as long as `i` is less than `5`. The `i++` statement is used to increment `i` by `1` after each iteration of the loop.


## The While Loop
The `while` loop: The `while` loop is used to execute a block of code repeatedly as long as a condition is true. Here's an example:
```java

int i = 0;

while (i < 5) {
    System.out.println("The value of i is: " + i);
    i++;
}
```
In this example, we start the loop with `int i = 0`, and the loop will continue to execute as long as `i` is less than `5`. The `i++` statement is used to increment `i` by `1` after each iteration of the loop.

## The Do While Loop
The `do-while` loop: The `do-while` loop is used to execute a block of code repeatedly as long as a condition is true, but it will always execute the code at least once, even if the condition is false. Here's an example:
```java

int i = 0;

do {
    System.out.println("The value of i is: " + i);
    i++;
} while (i < 5);
```
In this example, we start the loop with `int i = 0`, and the loop will continue to execute as long as `i` is less than `5`. The `i++` statement is used to increment `i` by `1` after each iteration of the loop.
Those are the three types of loops in Java! Each type of loop has its own use case, and it's up to the programmer to choose which loop is best suited for the task at hand.


But be careful not to create an infinite loop, which is a loop that never ends. For example, this is an infinite loop:
```java
while (true) {
    System.out.println("Help! I'm stuck in a loop!");
}
```
If you run this code, your program will keep printing "Help! I'm stuck in a loop!" forever and ever until you stop it manually. This can cause your computer to slow down or crash. So don't do that unless you want to annoy your teacher or boss.
