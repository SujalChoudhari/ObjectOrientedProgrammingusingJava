# Switch Case
Switch statements in Java are a way to execute 
different blocks of code based on the value of a single variable. 
Here's an example:

```java
int dayOfWeek = 3;

switch(dayOfWeek) {
    case 1:
        System.out.println("It's Monday, bleh!");
        break;
    case 2:
        System.out.println("It's Tuesday, meh.");
        break;
    case 3:
        System.out.println("It's Wednesday, when huh, what day?");
        break;
    case 4:
        System.out.println("It's Thursday, almost there!");
        break;
    case 5:
        System.out.println("It's Friday, party time!");
        break;
    default:
        System.out.println("It's the weekend, woo hoo!");
        break;
}

```

In the above example, we have a variable `dayOfWeek` that has been assigned the value `3`. We then use a `switch` statement to check the value of `dayOfWeek` and execute a different block of code based on that value.

In this case, the `case 1` block of code will not execute because `dayOfWeek` is not equal to `1`. However, the `case 3` block of code will execute because `dayOfWeek` is equal to `3`. The `break` statement is used to exit the switch statement and prevent the other cases from being executed.
If `dayOfWeek` is not equal to any of the cases, the `default` block of code will be executed.

Switch statements can be a useful tool in programming when you need to execute different blocks of code based on a single variable. And as a bonus, they can make your code look a little cooler and more organized too!