package reflection.week05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TvTableBuilderTest {
    private TvTableBuilder builder = new TvTableBuilder();

    private List<String> expectedParts = Arrays.asList("leg","leg","leg","leg","shelf","top");

    @Test
    void build() {
        TvTable table = builder.build();
        List<String> parts = table.getParts();
        Assertions.assertLinesMatch(expectedParts, parts);
    }

    @Test
    void checkSize(){
        TvTable table = builder.build();
        List<String> parts = table.getParts();
        Assertions.assertEquals(expectedParts.size(), parts.size());
    }


}