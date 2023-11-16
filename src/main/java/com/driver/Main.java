package com.driver;

// Main.java
package com.example;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly(); // Task 3: Creating an object of class RWOnly

        // Task 4: Attempting to access private member directly - This will result in a compilation error
        // System.out.println(obj.name); // This line will generate an error

        // Task 6: Setting value using setter function and accessing using getter function
        obj.setName("John");
        System.out.println(obj.getName());
    }
}
