public class PalindromeChecker {
    
public static void main(String[] args) {
        String[] strings = {"amma", "nanna", "akka", "mom"};

        for (String string : strings) {
            if (isPalindrome(string)) {
                System.out.println(string + " is a palindrome.");
            } else {
                System.out.println(string + " is not a palindrome.");
            }
        }
}
public static boolean isPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) == string.charAt(string.length()- i - 1)) {
                return true;
            }
        }
        return false;
    }
    }

