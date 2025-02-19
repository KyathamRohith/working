public class Palindrome {
    public static void main(String[] args) {
        String str = "madam"; // Example string
        boolean result = isPalindrome(str);
        if (result) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
}
