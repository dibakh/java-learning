package challenge.unblockMeChallange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverlapCheckerTest {

    @Test
    void isOverlapping() {
        OverlapChecker overlapChecker = new OverlapChecker();
        boolean actual = overlapChecker.isOverlapping("0 h 1 3 2 1 h 5 3 2");
//        assertTrue(actual);
        System.out.println(actual);
    }
}