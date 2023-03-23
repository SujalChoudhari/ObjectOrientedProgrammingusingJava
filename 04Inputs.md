# Inputs

Inputs in Java are like a box of chocolates: you never know what you're going to get. Sometimes they are sweet and easy to handle, like a Scanner object that reads from the keyboard. 

Other times they are bitter and hard to digest, like a `FileInputStream` that throws an `IOException`. And sometimes they are just plain weird, like a `BufferedReader` that wraps around a `FileReader` that wraps around a `File` object. But no matter what kind of input you get, you have to deal with it somehow. That's why Java has so many classes and methods for input handling. They help you cope with the uncertainty and complexity of inputs in Java.

## Scanner 
The Scanner class in Java is a very useful tool for reading user input from the keyboard. It can also read data from files, strings, and other sources. However, it has some quirks that you should be aware of. For example:

- You need to `import java.util.Scanner` before using it.
- You need to create a Scanner object and pass it a source of data, such as System.in for keyboard input.
- You need to close the Scanner object when you are done with it, otherwise you may leak resources.
- You need to use different methods to read different types of data, such as `nextInt()` for integers and `nextLine()` for strings.
- You need to be careful with the `nextLine()` method, because it reads the entire line including the newline character. This can cause problems if you use it after another method that does not consume the newline character, such as `nextInt()`. In that case, you may want to use an extra `nextLine()` to skip the newline character before reading the actual string.

These are some of the common pitfalls of using the Scanner class in Java. If you follow these tips, you will have a much easier time working with user input. And remember: always check your input for errors and exceptions!

```java
package com.sujalchoudhari;

import java.util.Scanner; // For taking inputs

public class Inputs {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter No 1: ");
			int a = scanner.nextByte();
			System.out.println("Enter No 2: ");
			int b = scanner.nextByte();
			System.out.println(a+b);
		}	
	}

}
```

If you want to read text from a file or a network connection in Java, you might want to use the `BufferedReader` class. This class allows you to read lines of text efficiently and conveniently. 

For example, you can create a `BufferedReader` object like this:
```java
BufferedReader br = new BufferedReader(new FileReader("file.txt"));

Then you can use the readLine() method to read each line of text from the file:

String line = br.readLine();

while (line != null) {
  System.out.println(line); // do something with the line
  line = br.readLine(); // read next line
}
```
Don't forget to close the BufferedReader when you are done with it:
```
br.close();
```
Sounds easy, right? Well, not so fast. There are some pitfalls that you need to be aware of when using the BufferedReader class. For instance, what if the file is too large to fit in memory? What if the file contains binary data instead of text? What if the file is corrupted or has an unexpected encoding? What if there is an `IOException` or a `NullPointerException`? What if someone deletes the file while you are reading it? What if aliens invade Earth and destroy all computers?

As you can see, using the BufferedReader class is not as simple as it seems. You need to handle all these possible scenarios and more. That's why some programmers prefer to use other methods of reading text in Java, such as `Scanner`, `StreamTokenizer`, or `NIO`. But don't worry, if you follow some best practices and use `try-catch-finally` blocks, you can still use the BufferedReader class safely and effectively. Just don't forget to have fun while coding!