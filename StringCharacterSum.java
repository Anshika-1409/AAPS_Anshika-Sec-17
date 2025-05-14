public class StringCharacterSum {
    public static int sumOfDigits(String str) {
        int sum = 0;

        // Iterate through the string and calculate the sum of numeric characters
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0'; // Convert character to integer and add to sum
        }

        return sum;
    }

    public static void main(String[] args) {
        String input = "123456"; // String containing only integers
        int sum = sumOfDigits(input);

        System.out.println("String: " + input);
        System.out.println("Sum of digits in the string: " + sum);
    }
}