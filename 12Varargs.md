Varargs, short for "variable-length arguments," is a feature in Java that allows a method to accept an arbitrary number of arguments of the same type. It's often used when you want to pass an unknown number of arguments to a method.

Here's an example of how to use varargs:

```java

public static int findAverage(int... numbers) {
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return sum / numbers.length;
}

```
In this example, the findAverage method takes a varargs parameter numbers of type int. This means that the method can accept any number of int values as its arguments. Inside the method, the numbers parameter is treated like an array of ints.

The method calculates the sum of all the values passed as arguments and then returns the average value by dividing the sum by the number of arguments.

Here's an example of how you can call the findAverage method:

```java
int average = findAverage(5, 10, 15, 20);
```
In this case, the findAverage method is called with four arguments: 5, 10, 15, and 20. The method calculates the average of these values and returns the result, which is then stored in the average variable.

The use of varargs can simplify method calls by allowing you to pass an arbitrary number of arguments without having to create an array to hold them. This can make code more concise and easier to read.

Varargs can be useful in situations where the number of arguments passed to a method is not known at compile time. For example, if you're writing a method that needs to take a variable number of parameters, such as a method to add up a list of numbers or concatenate an unknown number of strings.

In summary, varargs are a convenient feature of Java that allow you to pass an arbitrary number of arguments of the same type to a method. They can simplify method calls and make code more concise and easier to read, particularly in situations where the number of arguments is not known at compile time.

Here is an another example:
```java
public static void main(String[] args) {
		System.out.println("Average is: "+ average());
		System.out.println("Average is: "+ average(1,2,3));
		System.out.println("Average is: "+ average(1,2,3,4));
		System.out.println("Average is: "+ average(1,2,3,4,5));
		System.out.println("Average is: "+ average(1,2,3,4,5,6,7,100));
	}
	
	public static float average(int ...arr) { /// arr is varArgs
		if(arr.length == 0) return 0f;
		float sum=0f;
		for(int el:arr) {sum+= el;}	
		return sum/arr.length;
	}
```