public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;

        // Make the number positive for comparison in case it's negative
        number = Math.abs(number);

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse == Math.abs(original);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Test cases:");
        System.out.println("Is 121 a palindrome? " + isPalindrome(121));       // true
        System.out.println("Is -121 a palindrome? " + isPalindrome(-121));     // true
        System.out.println("Is 123 a palindrome? " + isPalindrome(123));       // false
        System.out.println("Is 1221 a palindrome? " + isPalindrome(1221));     // true
        System.out.println("Is -12321 a palindrome? " + isPalindrome(-12321)); // true
        System.out.println("Is 10 a palindrome? " + isPalindrome(10));         // false
    }
}
