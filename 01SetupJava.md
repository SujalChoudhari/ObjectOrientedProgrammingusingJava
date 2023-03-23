# Lets Setup Java
Step by step guide to setup Java:

1. Download the latest version of Java from the official website. Make sure you choose the right one for your operating system and architecture. If you are not sure, just pick the one that says "Java Runtime Environment (JRE)" and hope for the best.
2. Run the installer and follow the instructions on the screen. You may have to agree to some terms and conditions, but don't worry, they are not your adoption papers. Just click "I agree" and move on.
3. Set up the environment variables for Java. This is a crucial step that will allow you to run Java programs from anywhere on your computer. To do this, you need to edit some files that are hidden deep in your system settings. Don't be scared, it's not as hard as it sounds. Just follow these simple steps:
    - Open a command prompt or terminal window and type `echo %PATH%` or "echo $PATH" depending on your operating system. This will show you a long string of text that contains all the paths where your computer looks for programs to run.
    - Copy this string and paste it into a text editor of your choice. Add a semicolon (;) at the end of it and then type `C:\Program Files\Java\jdk-17\bin` or `/usr/lib/jvm/java-17-openjdk/bin` depending on where you installed Java. This will add the path to the Java bin folder to your PATH variable.
    - Save this file as `path.txt` somewhere on your computer where you can easily find it later.
    - Go back to your command prompt or terminal window and type `setx PATH /F path.txt` or `export PATH=$(cat path.txt)` depending on your operating system. This will update your PATH variable with the new value from the file you just created.
    - Close and reopen your command prompt or terminal window to apply the changes.
4. Congratulations! You have successfully set up Java on your computer! Now you can write and run Java programs using any IDE or editor of your choice. To test if everything works fine, try typing `java -version` in your command prompt or terminal window and see if it shows you something like this:
```bash
java version "17"
Java(TM) SE Runtime Environment (build 17+35-2724)
Java HotSpot(TM) 64-Bit Server VM (build 17+35-2724, mixed mode)
```
**It is not necessary to use java17 but it is used during the making of this page**
If you see something like this, then you are good to go! If not, then something went wrong along the way and you may have to start over from step 1 or blindly follow a Youtube Tutorial?   

## We need an IDE
We will be using Eclipse but any other IDE will be file.

If you want to start coding in Java, you will need a good IDE (Integrated Development Environment) that can help you write, compile and debug your code. One of the most popular IDEs for Java is Eclipse, which is free and open source. Here is a step by step guide to setup Eclipse IDE for Java:

1. Download Eclipse from https://www.eclipse.org/downloads/. Choose the package that suits your needs, such as Eclipse IDE for Java Developers or Eclipse IDE for Enterprise Java Developers.
2. Run the installer and follow the instructions on the screen. You may need to specify the location of your Java Development Kit (JDK), which is required to run Eclipse. If you don't have JDK installed, you can download it from https://www.oracle.com/java/technologies/javase-downloads.html.
3. Launch Eclipse and create a new workspace, which is a folder where you will store your projects and settings. You can choose any location for your workspace, but make sure it is easy to access and remember.
4. Create a new project by clicking on File > New > Project... and selecting Java Project from the list of options. Give your project a name and click Finish.
5. Create a new class by right-clicking on your project in the Package Explorer view and selecting New > Class... Give your class a name and click Finish.
6. Write some code in your class by typing in the editor window or using the code templates provided by Eclipse. You can also use Ctrl+Space to activate content assist, which will suggest possible completions for your code based on context.
7. Run your code by clicking on Run > Run As > Java Application or pressing Ctrl+F11. You should see the output of your code in the Console view at the bottom of the screen.

Congratulations! You have successfully set up Eclipse IDE for Java and ran your first program! Now you can explore more features of Eclipse, such as debugging tools, refactoring tools, testing tools and more!

## Da Code.
So without any further ado, lets see our Hello World Code.
```java
package com.sujal;

public class NOTES_00_HelloWorld {

	public static void main(String[] args) {
		System.out.print("Hello World!");
	}

}
```
What does any of these things do? Well, Thats a journey we will be doing for few hours. Enjoy✌️.

