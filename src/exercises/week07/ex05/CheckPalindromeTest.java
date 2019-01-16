package exercises.week07.ex05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckPalindromeTest {

    @Test
    void checkLongText() {
        CheckPalindrome checkPalindrome = new CheckPalindrome();

        String word = "Devo met a Mr eh DNA and her mate moved";
        boolean answer = checkPalindrome.check(word);

        Assertions.assertEquals(true,answer);
    }

    @Test
    void checkEmptyText() {
        CheckPalindrome checkPalindrome = new CheckPalindrome();

        String word = "";
        boolean answer = checkPalindrome.check(word);

        Assertions.assertFalse(answer);
    }

    @Test
    void checkSpaceText() {
        CheckPalindrome checkPalindrome = new CheckPalindrome();

        String word = "                             ";
        boolean answer = checkPalindrome.check(word);

        Assertions.assertFalse(answer);
    }
}