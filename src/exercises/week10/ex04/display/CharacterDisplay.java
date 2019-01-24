package exercises.week10.ex04.display;

import com.sun.org.apache.xpath.internal.operations.Bool;
import exercises.week10.ex04.logic.CharacterSummarizer;

import java.util.Map;
import java.util.Optional;

public class CharacterDisplay {
    private CharacterSummarizer characterSummarizer = new CharacterSummarizer();

    public void bookWithMostdeadFromStarkAllegiance() {
        Optional<Map.Entry<String, Long>> bookWithMostdeadFromStark = characterSummarizer.getBookWithMostdeadFromStarkAllegiance();
        System.out.print("\nIn which book die the most amount of characters from the Stark allegiance? ");
        System.out.println(bookWithMostdeadFromStark.get().getKey());
    }

    public void twoAllegiancesWithHighestDead() {
        String allegiances = characterSummarizer.getTwoAllegiancesWithHighestDead();
        System.out.println("\nWhich ones are the two allegiances that have the biggest dead count? ");
        System.out.println(allegiances);
    }

    public void whoIsDeadInBookOfHighestDead() {
        Optional<Map.Entry<String, Long>> first = characterSummarizer.getBookWithHighestDeath();
        String collectedNames = characterSummarizer.getWhoIsDeadInBookOfHighestDead(first.get().getKey());
        System.out.println("\nDeath people in book " + first.get().getKey() + " : ");
        System.out.println(collectedNames);
    }

    public void bookWithHighestDeath() {
        Optional<Map.Entry<String, Long>> first = characterSummarizer.getBookWithHighestDeath();
        if (first.isPresent()) {
            System.out.println("\nbook " + first.get().getKey() + " has " + first.get().getValue() + " death.");
        }
    }

    public void percantageOfDeathManAndWoman() {
        long numberOfDeath = characterSummarizer.getNumberOfDeadChar();
        String message = characterSummarizer.getPercantageOfDeathManAndWoman(numberOfDeath);
        System.out.println("\n" + message);
    }

    public void numberOfDeadChar() {
        long numberOfDeath = characterSummarizer.getNumberOfDeadChar();
        System.out.println("\nHow many characters died? " + numberOfDeath);
    }

    public void totalCharInBook() {
        long numberOfCharacters = characterSummarizer.getTotalCharInBook();
        System.out.println("\nHow many characters appear in the books in total? " + numberOfCharacters);
    }

    public void whichBookHasMostDeadFromLannister() {
        Optional<Map.Entry<String, Long>> bookWhichHasMostDeadFromLannister = characterSummarizer.getBookWhichHasMostDeadFromLannister();
        System.out.println("\nIn which book die the most amount of characters from the Lannister allegiance? " + bookWhichHasMostDeadFromLannister.get().getKey());
    }

    public void percantageOfNobilityChar() {
        String percantageOfNobilityChar = characterSummarizer.getPercantageOfNobilityChar();
        System.out.println("\nWhich percentage of deaths belong to nobility characters? " + percantageOfNobilityChar);
    }

    public void howManyStraksAreDead() {
        long numberOfDeadStark = characterSummarizer.getNumberOfDeadStark();
        System.out.println("\nHow many Starks have died? " + numberOfDeadStark);
    }

    public void howManyLannisterAreDead() {
        long numberOfDeadLannisters = characterSummarizer.getNumberOfDeadLannisters();
        System.out.println("\nHow many Lannisters have died? " + numberOfDeadLannisters);
    }

    public void anyAliveChar() {
        Boolean isAny = characterSummarizer.isThereAnyAliveChar();
        System.out.println("\nIs there any character who didn’t die? " + isAny);
    }

    public void AnyCharIntroducedAndKilledInSameChapter() {
        Boolean isAny = characterSummarizer.isThereAnyIntroducedAndDeadInSameChapter();
        System.out.println("\nHas any character ever been killed in the same chapter that it got introduced? " + isAny);

    }
}
