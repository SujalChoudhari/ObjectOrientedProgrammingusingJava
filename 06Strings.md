# Strings

Strings in Java are like a box of chocolates. 
You never know what you're going to get. 

Sometimes they are sweet and delicious, like when you use the concat() method to join them together. Other times they are bitter and hard to swallow, like when you use the `equals()` method to compare them and it returns `false`. And sometimes they are just plain nuts, like when you use the `split()` method and end up with an array of weird substrings. Strings in Java are fun to work with, but also tricky and unpredictable. Just like life.

Strings in Java are objects that represent sequences of characters. They are immutable, meaning that they cannot be modified once created. Strings can be created using literals, such as "Hello", or using constructors, such as new String("Hello"). Strings have many methods that allow operations such as concatenation, comparison, searching, formatting and conversion. Strings are also used to store and manipulate text data in various applications.

```java
//	String a = new String("AA");
//	System.out.println(a);
//	System.out.printf("printf %d %f %c %s",1,1.3f,'a',"Hello");
//	System.out.format("printf %d %10.3f %c %s",1,1.3220110f,'a',"Hello");

try (Scanner sc = new Scanner(System.in)) {
	String newer = sc.nextLine();
	System.out.println("\n\n"+newer);
}


// Sting methods
String name = new String("ABCDEFGH");
System.out.println(name);
System.out.println(name.length());
System.out.println(name.charAt(2));
System.out.println(name.toLowerCase());
System.out.println(name.concat("IJK"));
System.out.println(new String("     a-a---a     ").trim());
System.out.println(name.substring(1,5));
System.out.println(name.replace('A', 'Z'));
```
Explaination:
- `String a = new String("AA");` creates a new `String` object and initializes it with the value "AA".
- `System.out.println(a);` prints the value of `a` to the console.
`System.out.printf("printf %d %f %c %s",1,1.3f,'a',"Hello");` uses the `printf` method to format and print text to the console. It takes in a format string and a list of arguments, and replaces the format specifiers with the corresponding argument values.
- `System.out.format("printf %d %10.3f %c %s",1,1.3220110f,'a',"Hello");` is similar to the `printf` method, but uses the `format` method instead. The format string contains a width specifier (`10`) and a precision specifier (`.3`) for the floating point argument.
- `try (Scanner sc = new Scanner(System.in)) {` creates a new `Scanner` object to read input from the console.
- `String newer = sc.nextLine();` reads a line of input from the user and stores it in a new `String` variable called `newer`.
- `System.out.println("\n\n"+newer);` prints the value of `newer` to the console, after adding two new lines for spacing.
- `String name = new String("ABCDEFGH");` creates a new `String` object and initializes it with the value "ABCDEFGH".
- `System.out.println(name);` prints the value of `name` to the console.
`System.out.println(name.length());` prints the length of `name` to the console.
- `System.out.println(name.charAt(2));` prints the character at index 2 of `name` to the console.
- `System.out.println(name.toLowerCase());` prints a lowercase version of `name` to the console.
- `System.out.println(name.concat("IJK"));` concatenates the `String` "IJK" to `name` and prints the result to the console.
- `System.out.println(new String(" a-a---a ").trim());` trims leading and trailing whitespace from a new `String` object and prints the result to the console.
- `System.out.println(name.substring(1,5));` extracts a substring from `name` starting at index 1 and ending at index 5, and prints the result to the console.
- `System.out.println(name.replace('A', 'Z'));` replaces all occurrences of the character 'A' in `name` with the character 'Z', and prints the result to the console.