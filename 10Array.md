# Array

In Java, an array is a data structure that stores a fixed-size sequence of elements of the same type. Each element can be accessed by an index that starts from 0.


```java
int[] squares= new int[10]; // Initialized array


for(int i=0;i<10;i++) {
    squares[i] = i*i;   // Assigned values to the array
}

for(int i=0;i<10;i++) {
    System.out.println(squares[i]); // Print the array
}
System.out.println(squares.length); // Array have a length property
    
// Multidimensional array
int[][] wierd = {
            {10,20,30,40,50},
            {60,70,80,90,100},
            {1,2,3,4,5,6,7,8,9,10}
        };

// Printing using for-each loop
for(int[] el: wierd) {
    for(int el2:el) {
        System.out.println(el2);
    }
}

```

In the given example, an array named `squares` is declared and initialized with a size of 10 using the `new` keyword. Then, a `for` loop is used to calculate the square of each index and store it in the corresponding element of the array.
Next, another `for` loop is used to print out the contents of the `squares` array. The `length` property of the array is used to get the size of the array.
Then, a 2D array named `weird` is declared and initialized with values. It contains three rows and each row has a different number of columns.

Finally, a nested `for-each` loop is used to print out the elements of the `weird` array. The outer loop iterates over each row of the 2D array, while the inner loop iterates over each element of that row and prints it out.
Arrays are useful for storing and accessing a fixed number of values of the same type. They are commonly used in many programming tasks, such as sorting, searching, and data processing.
