package exercises.week07.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MainApplicationTest {

    @Test
    void checkString() {
        NickNameCreator nickNameCreator = new NickNameCreator();

        List<String> names = Arrays.asList("House", "tree", "Theatre", "somewhere", "bottle");
        List<String> answer = nickNameCreator.creator(names);

        List<String> expectedNiknames=Arrays.asList("Ho","tr","The","some","bot");

        Assertions.assertEquals(expectedNiknames,answer);

    }

    @Test
    void checkEmptyString() {
        NickNameCreator nickNameCreator = new NickNameCreator();

        List<String> names = Arrays.asList("");
        List<String> expectedNiknames=Arrays.asList("");

        List<String> nickNames = nickNameCreator.creator(names);


        Assertions.assertEquals(expectedNiknames,nickNames);
    }



}