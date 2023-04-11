# Access Modifiers
In this code, we're learning about something called "access modifiers" and "getters and setters". Access modifiers help us control who can see and change certain things in our code, like properties of an object. Getters and setters are like little helper functions that help us access or change those properties.

Let's look at the code line by line:
```java
class Sample {
	public byte publicProperty;
	@SuppressWarnings("unused")
	private byte m_PrivateProperty;
	
	public void setPrivate(int a) {
		m_PrivateProperty =(byte) a;
		//this.m_PrivateProperty = (byte)a;
	}
}
```

In this part of the code, we're creating a new "class" called "Sample". This class has two properties: a "public" property called "publicProperty", and a "private" property called "m_PrivateProperty".

Now, the "public" property can be seen and changed by anyone who uses this class, like how you can see and play with toys in a toy store. But the "private" property is like a secret toy that you can't touch or see, because it's only for the people who work in the toy store (aka the code).

But wait, we still want to be able to access and change that "private" property! That's where the "setPrivate" function comes in. This function is like a special key that lets us unlock the secret toy and change it.

```java
public static void main(String[] args) {
	Sample sample = new Sample();
	sample.publicProperty = 10;
	//sample.privateProperty = 1; //cannot access it here
	sample.setPrivate(1); // can access using setters and getters
	System.out.println(sample.publicProperty);		
}
```
Finally, in this part of the code, we're using our "Sample" class to create a new "sample" object. We can then access and change the "public" property of our "sample" object, but we can't see or change the "private" property directly. Instead, we use our "setPrivate" function to change the "private" property.

In summary, access modifiers and getters/setters help us control who can see and change certain parts of our code, like properties of an object. It's like having a secret toy that only you can play with, but you have a special key that lets your friends play with it too!

## Naming Conventions
This is a bonus section, but it's important to know about naming conventions in Java. 
### Case
In Java, we use "camelCase" for naming variables and functions. 
This means that we start with a lowercase letter, and then we capitalize the first letter of each word. 
For example, "myVariable" or "myFunction".

But not always - sometimes we use "PascalCase" for naming classes. Like classes and interfaces, we start with a capital letter, and then we capitalize the first letter of each word. For example, "MyClass" or "MyInterface".

For Constants, we use "UPPERCASE" for naming constants. For example, "MY_CONSTANT", or "API_AUTH_ID_KEY".

There is one more, "snake_case" it is not used in Java, but it is used in other languages.

### Prefixes
In Java, we use "m_" as a prefix for private variables. Or sometimes we use "m" as a prefix for private variables.
For example, "m_myVariable" or "mMyVariable".
For protected variables, we use "p_" as a prefix. Sometimes we use "p" as a prefix. 
I personally don't use "p" as a prefix, I like using pm_ instead. 

For Interfaces, we use "I" as a prefix. For example, "IMyInterface".
Later on, in Generics, we'll use "T" as a prefix for generic types. For example, "TMyType".

Using Some naming conventions can help us keep our code organized and easy to read. 
We are able to predict what the scope of a variable is, and what it's used for. It is so good to have.