
# Introductio of Java as an Object Oriented Programming Language
Java is an object oriented programming language, which means that everything in Java is an object. 
An object is a bundle of data and behavior that can interact with other objects. 

For example, a dog object can have data like name, breed, color, and behavior like bark, wag tail, fetch ball. 
Java lets you create your own objects and use them to make complex programs. 
However, not everything in Java is as simple as a dog object. 
Sometimes you have to deal with abstract classes, interfaces, inheritance, polymorphism, and other fancy terms that sound like they belong in a Harry Potter book. Don't worry though, this course will teach you how to master these concepts and become a wizard of Java programming.

If you want to learn how to program, you need to understand two main paradigms: `procedure` and `object-oriented`. 

**Procedure** is when you write a series of steps that tell the computer what to do. *C is a procedure oriented programming language*.

**Object-oriented** is when you create entities that have attributes and behaviors, and then make them interact with each other. 
Think of it like this: procedure is like following a recipe, while object-oriented is like playing with Lego bricks. Both can achieve the same result, but in different ways. Some people prefer one over the other, but it's good to know both so you can choose the best tool for the job.

# To Java or To Not Java
Java is a popular programming language that has many features. Some of the features of Java are:
## Pros:
- It is platform-independent, which means it can run on any device that has a Java Virtual Machine (JVM).
- It is object-oriented, which means it organizes data and behavior into classes and objects.
- It is multithreaded, which means it can execute multiple tasks simultaneously using threads.
- It is robust, which means it has mechanisms to handle errors and exceptions gracefully.

## Cons:
However, Java also has some drawbacks. For example:
- It is verbose, which means it requires a lot of code to perform simple tasks.
- It is slow, which means it takes more time and memory to execute than other languages.
- It is boring, which means it lacks some of the fun and expressive features of other languages.

So, if you are looking for a language that is reliable, portable and widely used, Java might be a good choice. But if you are looking for a language that is concise, fast and exciting, you might want to look elsewhere.

### JVM (The Java Virtual Machine)
The Java Virtual Machine (JVM) is a mysterious and powerful entity that runs your Java code. But how does it work? Well, it's not magic, it's science! Here's a simplified explanation of what happens when you run a Java program:

1. The JVM loads the bytecode of your program from a file or a network source. Bytecode is a compact and portable representation of your Java code that can be executed by the JVM.
2. The JVM verifies the bytecode to make sure it is well-formed and does not violate any security or integrity rules. This prevents malicious or corrupted code from harming your system.
3. The JVM interprets the bytecode and executes it one instruction at a time. The JVM has its own stack and heap memory to store data and objects during the execution.
4. The JVM may also compile some or all of the bytecode to native machine code using a just-in-time (JIT) compiler. This improves the performance of your program by avoiding interpretation overhead.
5. The JVM manages the memory allocation and garbage collection of your program. It frees up unused memory and reclaims it for future use.
6. The JVM interacts with the underlying operating system and hardware to access resources such as files, network, graphics, etc.

As you can see, the JVM does a lot of work behind the scenes to make your Java code run smoothly and efficiently. It is like a loyal servant that takes care of everything for you without asking for anything in return. Well, maybe just some coffee ☕️. Saw what I did there? 

# Principles of OOP: 
## Object
An object is a bundle of data and behavior that represents something in the real world. For example, a dog object might have data like name, breed, color, and behavior like bark, wag tail, fetch.🐕 Objects are useful because they allow us to model complex systems with simple and reusable components. However, not all objects are created equal. Some objects are more fun than others. Here are some examples of fun objects:

- A rubber duck object that squeaks when you squeeze it and floats on water.
- A pizza object that has toppings like cheese, pepperoni, mushrooms, and behavior like bake, slice, eat.
- A joke object that has data like setup, punchline, and behavior like tell, laugh.

These are just some of the fun objects you can create with the principles of OOP. Object-oriented programming is not only a powerful way to design software but also a great way to have fun!

## Class

One of the principles of OOP is class. A class is like a blueprint for creating objects. For example, you can have a class called Dog that defines the attributes and behaviors of dogs, such as name, breed, bark, fetch, etc. Then you can create instances of the Dog class, such as Fido, Spot, Rover, etc. Each instance has its own values for the attributes and can perform the behaviors defined by the class. A class is also like a club that only allows members who follow its rules. For example, you can't have a Dog instance that meows or lays eggs. That would violate the class definition and make other dogs very confused.

Enough of those OOPS concepts, Let's start with out first Code!
fot that You will need to set up Java.