# Classes

So, have you ever played with LEGO blocks before? 
Well, OOPS classes are a lot like LEGO blocks, 
but instead of building a toy, we're building a program!

Imagine we want to create a game where you're the boss of a pizza restaurant. 
OOPS classes help us create all the things we need for our game, 
like the employees who work at the pizza place, the pizzas they make, 
and the customers who come to eat.

So in this code, we're creating a "class" called "Employee". 
Think of a class like a blueprint or a set of instructions for building an employee. 
We're telling the computer what an employee should look like - 
they should have an id (like a number) and a name (like "Sujal" or "Charlie").

Next, we're making two different ways to create an employee. 
One way is to make an employee with a default id of 0 and a default name of "Player1". 
This is like making a LEGO person with the same outfit every time. 
The other way is to make an employee with a specific id and name that we choose. 
This is like making a LEGO person with different hair and clothes each time.

Finally, we're using the second way to create a new employee named "Sujal" with an id of 10. 
This is like making a LEGO person with a special name and outfit. 
And then we're printing out Sujal's id and name to the screen, 
like saying "Hey computer, tell me what Sujal's id and name are!"

So, in summary, OOPS classes are like LEGO blocks that help us build a program with different pieces that work together, 
and this code is showing us how to build an employee with a special name and id. Pretty cool, huh?

```java
package com.sujalchoudhari;

class Employee{
	public int id;
	protected String name;
	
	// constructors
	Employee(){
		id = 0;
		name = "Player1";
	}
	
	// constructor overloading
	Employee(int _id,String _name){
		id = _id;
		name = _name;
	}
}


public class NOTES_13_OOPS_Classes {
	public static void main(String[] args) {
		Employee sujal = new Employee(10,"Sujal");
		System.out.println(sujal.id);
		System.out.println(sujal.name);
	}
}

```