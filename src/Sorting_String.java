import java.util.Arrays;

public class Sorting_String {
    public static void sortStrings(String[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        String[] testArray = {"banana", "apple", "cherry", "date"};
        System.out.println("Before sorting: " + Arrays.toString(testArray));
        
        sortStrings(testArray);
        
        System.out.println("After sorting: " + Arrays.toString(testArray));
    }
}
