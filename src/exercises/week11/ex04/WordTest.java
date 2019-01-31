package exercises.week11.ex04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void compare() {
        Word word = new Word();
        Boolean result = word.compare("pale", "pales");
        System.out.println(result);
    }
}