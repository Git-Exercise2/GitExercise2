# CustomSort

## Project Overview
`CustomSort` is a Java program that provides functionality to sort a list of strings based on their length. It includes the `sortByLength` method, which uses a `Comparator` to sort the input list by string length.

## Features
- Sorts strings based on their length in ascending order
- Handles empty lists and single-element lists
- Maintains the relative order of strings with equal length
- Includes unit tests using JUnit

## Running Tests
- javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar -d out src/github/CustomSortTest.java
- java -cp .:out:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore github.CustomSortTest

## Usage Example
- List<String> input = Arrays.asList("banana", "kiwi", "apple", "cherry");
- List<String> sorted = CustomSort.sortByLength(input);
- System.out.println(sorted);

## Example Output
- [kiwi, apple, banana, cherry]

## Test Description
- The CustomSortTest class uses the JUnit framework and covers:
- Basic sorting functionality
- Handling of strings with the same length
- Handling of empty lists
- Handling of single-element lists
- Handling of strings with different lengths