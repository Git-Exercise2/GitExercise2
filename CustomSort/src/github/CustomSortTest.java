package github;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class CustomSortTest {
    @Test
    public void testSortByLength() {
        List<String> input = Arrays.asList("banana", "kiwi", "apple", "cherry");
        List<String> expected = Arrays.asList("kiwi", "apple", "banana", "cherry");
        assertEquals(expected, CustomSort.sortByLength(input));
    }

    @Test
    public void testSortWithEqualLength() {
        List<String> input = Arrays.asList("cat", "dog", "bat");
        List<String> expected = Arrays.asList("cat", "dog", "bat"); 
        assertEquals(expected, CustomSort.sortByLength(input));
    }

    @Test
    public void testSortWithEmptyList() {
        List<String> input = Arrays.asList();
        List<String> expected = Arrays.asList();
        assertEquals(expected, CustomSort.sortByLength(input));
    }

    @Test
    public void testSortWithSingleElement() {
        List<String> input = Arrays.asList("hello");
        List<String> expected = Arrays.asList("hello");
        assertEquals(expected, CustomSort.sortByLength(input));
    }

    @Test
    public void testSortWithDifferentLengths() {
        List<String> input = Arrays.asList("elephant", "ant", "giraffe", "cat", "hippopotamus");
        List<String> expected = Arrays.asList("ant", "cat", "elephant", "giraffe", "hippopotamus");
        assertEquals(expected, CustomSort.sortByLength(input));
    }
}
