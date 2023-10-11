import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a task: ");
        System.out.println("1. Shuffle an Array");
        System.out.println("2. Convert Roman Number to Integer");
        System.out.println("3. Check for Pangram");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                // Task 1: Shuffle an Array
                Integer[] array = {1, 2, 3, 4, 5, 6, 7};
                shuffleArray(array);
                System.out.println("Shuffled Array: " + Arrays.toString(array));
                break;
                
            case 2:
                // Task 2: Convert Roman Number to Integer
                System.out.print("Enter a Roman numeral: ");
                scanner.nextLine(); // Consume the newline character
                String roman = scanner.nextLine();
                int result = romanToInteger(roman);
                System.out.println(roman + " = " + result);
                break;
                
            case 3:
                // Task 3: Check for Pangram
                System.out.print("Enter a sentence: ");
                scanner.nextLine(); // Consume the newline character
                String input = scanner.nextLine();
                boolean isPangram = isPangram(input);
                if (isPangram) {
                    System.out.println("The input is a pangram.");
                } else {
                    System.out.println("The input is not a pangram.");
                }
                break;
                
            default:
                System.out.println("Invalid choice");
                break;
        }
        
        scanner.close();
    }

    public static void shuffleArray(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);
    }

    public static int romanToInteger(String s) {
        // Implementation remains the same
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        String[] symbols = {"I", "V", "X", "L", "C", "D", "M"};

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int index = Arrays.asList(symbols).indexOf(String.valueOf(s.charAt(i)));
            int value = values[index];
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        return result;
    }

    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}
