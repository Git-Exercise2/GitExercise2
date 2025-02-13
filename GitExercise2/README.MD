# Sorting Integers

## Overview
This project provides a simple implementation of integer sorting using selection sort. The program sorts an array of integers in ascending order. The implementation is accompanied by unit tests to verify the correctness of the sorting algorithm.

## Project Structure
```
SortingIntegers.java        # Contains the sorting algorithm implementation
SortingIntegersTest.java    # Contains JUnit test cases for validating the sorting algorithm
```

## Installation and Usage
### Prerequisites
- Java Development Kit (JDK) 8 or later
- JUnit 5 for testing

### Running the Program
1. Compile the Java file:
   ```sh
   javac sort/SortingIntegers.java
   ```
2. Run the program:
   ```sh
   java sort.SortingIntegers
   ```

### Example Output
```
Original array: [87, 12, 25, 45, 22, 56, 96]
Sorted array: [12, 22, 25, 45, 56, 87, 96]
```

## Testing
### Running Unit Tests
To run the unit tests using JUnit 5:
1. Ensure JUnit 5 is installed and configured in your IDE or command line environment.
2. Compile and run the test file:
   ```sh
   javac -cp .:junit-platform-console-standalone-1.8.2.jar sort/SortingIntegersTest.java
   java -jar junit-platform-console-standalone-1.8.2.jar --class-path . --select-class sort.SortingIntegersTest
   ```

### Test Cases
The `SortingIntegersTest` class includes various test cases to validate the sorting functionality:
- Sorting an unsorted array
- Handling an already sorted array
- Sorting a reverse-sorted array
- Handling a single-element array
- Sorting an array with duplicate elements
- Handling an empty array




