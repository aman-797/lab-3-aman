import java.util.Scanner;

class Task_4{
    public static void main(String[] args) {
        // Use a hardcoded string for testing
        String str = "A man a plan a canal Panama"; // Example palindrome
        
        System.out.println("Input string: " + str);
        
        // Remove spaces and convert to lowercase for a proper palindrome check
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        
        boolean isPalindrome = true;
        
        for (int i = 0; i < cleanedStr.length() / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(cleanedStr.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}