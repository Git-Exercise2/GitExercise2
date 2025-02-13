import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Sorting_String_Test {

    @Test
    public void testSortStrings() {
        String[] inputArray = {"banana", "apple", "cherry", "date"};
        String[] expectedArray = {"apple", "banana", "cherry", "date"};

        Sorting_String.sortStrings(inputArray);
        
        assertArrayEquals(expectedArray, inputArray, "The string array should be sorted in alphabetical order.");
    }
}
