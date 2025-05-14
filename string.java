public class string {
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
/*
public class string {
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append each character in reverse order
        }
        return reversed;
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}*/
