# Uncommon Java Bug: Insufficient Exception Handling

This repository demonstrates a subtle bug in Java exception handling.  The code attempts to access an array element beyond its bounds, leading to an `ArrayIndexOutOfBoundsException`. While the exception is caught, the error handling is minimal and could be improved.

## The Problem

The `UncommonBug.java` file contains a simple program that tries to access an element beyond the bounds of an integer array. Although a `try-catch` block is in place to handle the `ArrayIndexOutOfBoundsException`, the exception handling does not provide sufficient context or recovery for the application.

In real-world scenarios, simply catching an exception and printing its message isn't always sufficient.  Consider logging more detailed information, potentially attempting recovery, or implementing more robust error mitigation strategies.

## The Solution

The `UncommonBugSolution.java` file provides an improved solution.  It demonstrates how to handle the exception more effectively by logging the exception details, including the offending array index, and then allowing the program to continue safely. A more complete recovery might be attempted depending on context.

## How to run the code
1. Clone this repository
2. Compile the java files using a java compiler (javac UncommonBug.java)
3. Run the compiled class files using a java virtual machine (java UncommonBug)