package ModulTwo;

public class Paliondrome {
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder result = new StringBuilder(text);
        String fail = result.reverse().toString();
        return text.equalsIgnoreCase(fail); // your implementation here
    }
}
