package stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    /*@Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void nullParameterShouldThrowException() throws IllegalArgumentException {

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Palindrome("", , ));
        assertThrows("va", IllegalArgumentException);

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Text must not be null!");

        // When
        new PalindromeValidator().isPalindrome(null);
    }*/

    @Test
    public void validPalindrome() {

        assertEquals(new Palindrome().isPalindrome("Racecar"), true);
        assertEquals(new Palindrome().isPalindrome("start"), false);
        assertEquals(new Palindrome().isPalindrome("Apa"), true);
        assertEquals(new Palindrome().isPalindrome("11"), true);


    }

}
