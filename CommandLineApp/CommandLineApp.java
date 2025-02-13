package CommandLineApp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CommandLineApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the CLI App!");
        
        while (true) {
            System.out.print("Enter a command (type 'exit' or 'quit' to quit): ");
            String input = scanner.nextLine().trim().toLowerCase();
            boolean showTime = input.matches(".*\\btime\\b.*");
            boolean showDate = input.matches(".*\\bdate\\b.*");
            boolean showHi = input.matches(".*\\b(hello|hi)\\b.*");
            boolean showQuit = input.matches(".*\\b(exit|quit)\\b.*");

            if (showQuit) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            boolean validCommand = false; 

            if (showHi) {
                System.out.println("Hello, user!");
                validCommand = true;
            }

            if (showDate) {
                System.out.println("Current Date: " + LocalDate.now());
                validCommand = true;
            }

            if (showTime) {
                System.out.println("Current Time: " + LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a")));
                validCommand = true;
            }

            if (!validCommand) {
                System.out.println("Unknown command: " + input);
            }
        }

        scanner.close();
    }
}