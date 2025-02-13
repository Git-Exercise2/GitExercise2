package github;

import java.util.*;

public class CustomSort {
    
    public static List<String> sortByLength(List<String> strings) {
        List<String> sortedList = new ArrayList<>(strings); 
        sortedList.sort(Comparator.comparingInt(String::length));
        return sortedList;
    }

    public static void main(String[] args) {
        List<List<String>> testCases = Arrays.asList(
            Arrays.asList("banana", "kiwi", "apple", "cherry", "mango"),
            Arrays.asList("dog", "cat", "elephant", "tiger", "ant"),
            Arrays.asList("java", "python", "c", "c++", "javascript"),
            Arrays.asList("one", "three", "four", "seven", "twelve"),
            Arrays.asList("a", "abc", "abcd", "ab", "abcdef")
        );

        for (List<String> testCase : testCases) {
            List<String> sorted = sortByLength(testCase);
            System.out.println("Original: " + testCase);
            System.out.println("Sorted:   " + sorted);
            System.out.println("-------------------------");
        }
    }
}
