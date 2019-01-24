package exercises.week10.ex04;

import exercises.week10.ex04.model.Character;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CharacterSummarizer {
//    public static void main(String[] args) {
//        List<Character> lines = new CharacterReader().getLines();
//
//        long numberOfCharacters = displayTotalCharInBook(lines);
//        System.out.println("\nHow many characters appear in the books in total? " + numberOfCharacters);
//
//        long numberOfDeath = displayNumberOfDeadChar(lines);
//        System.out.println("\nHow many characters died? " + numberOfDeath);
//
//        String message = displayPercantageOfDeathManAndWoman(lines, numberOfDeath);
//        System.out.println("\n" + message);
//
//        Optional<Map.Entry<String, Long>> first = displayBookWithHighestDeath(lines);
//        if (first.isPresent()) {
//            System.out.println("\nbook " + first.get().getKey() + " has " + first.get().getValue() + " death.");
//        }
//
//        String collectedNames = displayWhoIsDeadInBookOfHighestDead(lines, first.get().getKey());
//        System.out.println("\nDeath people in book " + first.get().getKey() +" : ");
//        System.out.println(collectedNames);
//
//
//
//        String allegiances = displayTwoAllegiancesWithHighestDead(lines);
//        System.out.println("\nWhich ones are the two allegiances that have the biggest dead count?");
//        System.out.println(allegiances);
//
//
//        Optional<Map.Entry<String, Long>> bookWithMostdeadFromStark = displayBookWithMostdeadFromStarkAllegiance(lines);
//        System.out.print("\nIn which book die the most amount of characters from the Stark allegiance? ");
//        System.out.println(bookWithMostdeadFromStark.get().getKey());
//    }

    public Optional<Map.Entry<String, Long>>  displayBookWithMostdeadFromStarkAllegiance(List<Character> lines) {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> "Stark".equals(e.getAllegiances()))
                .collect(Collectors.groupingBy(e -> e.getBookOfDeath(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
                .findFirst();
    }

    public String displayTwoAllegiancesWithHighestDead(List<Character> lines) {
        return lines.stream()
                .filter(e->!e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(e->e.getAllegiances(),Collectors.counting()))
                .entrySet().stream()
                .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e->e.getKey() + " " + e.getValue())
                .collect(Collectors.joining("\n"));
    }

    public String displayWhoIsDeadInBookOfHighestDead(List<Character> lines, String key) {
        return lines.stream()
                .filter(e -> e.getBookOfDeath().equals(key))
                .map(e -> e.getName())
                .collect(Collectors.joining("\n "));
    }

    public Optional<Map.Entry<String, Long>> displayBookWithHighestDeath(List<Character> lines) {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(e -> e.getBookOfDeath(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst();
    }

    public long displayTotalCharInBook(List<Character> lines) {
        return lines.stream()
                .count();
    }

    public long displayNumberOfDeadChar(List<Character> lines) {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .count();
    }

    public String displayPercantageOfDeathManAndWoman(List<Character> lines, long numberOfDeath) {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .map(Character::getGender)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey()
                        .replace("0", "famale")
                        .replace("1", "male")
                        + "\t" + (e.getValue() * 100) / numberOfDeath + "%")
                .collect(Collectors.joining("\n"));
    }

//In which book die the most amount of characters from the Lannister allegiance?
//How many Starks have died?
//How many Lannisters have died?
//Is there any character who didn’t die?
//Has any character ever been killed in the same chapter that it got introduced?
}
