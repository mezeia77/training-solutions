package stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    @Test

    public void validPalindrome() {

        assertEquals(new Palindrome().isPalindrome("Racecar"), true);
        assertEquals(new Palindrome().isPalindrome("start"), false);
        assertEquals(new Palindrome().isPalindrome("Apa"), true);
        assertEquals(new Palindrome().isPalindrome("11"), true);
    }

}
