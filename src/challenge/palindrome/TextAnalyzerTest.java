package challenge.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextAnalyzerTest {
        TextAnalyzer textAnalyzer= new TextAnalyzer();
    @Test
    void isPalindromeWithoutSpace() {
        Boolean actual = textAnalyzer.isPalindrome("nan");
        assertTrue(actual);
    }

    @Test
    void isPalindromeWithSpace() {
        Boolean actual = textAnalyzer.isPalindrome("Tact Coa");
        assertTrue(actual);
    }

    @Test
    void isPalindromeWithSpaces() {
        Boolean actual = textAnalyzer.isPalindrome("never odd or even");
        assertTrue(actual);
    }

    @Test
    void isPalindromePermutation1() {
        Boolean actual = textAnalyzer.isPalindrome("taco cat");
        assertTrue(actual);
    }

    @Test
    void isPalindromePermutation2() {
        Boolean actual = textAnalyzer.isPalindrome("atco cta");
        assertTrue(actual);
    }

    @Test
    void notPolindrome() {
        Boolean actual = textAnalyzer.isPalindrome("I am diba");
        assertFalse(actual);
    }

    @Test
    void notPolindrome2() {
        Boolean actual = textAnalyzer.isPalindrome("ASHKAN mahtab Khajag DIBA");
        assertFalse(actual);
    }
}