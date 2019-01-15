package exercises.week09.ex04;

import exercises.week09.ex02.FileReader;

import java.util.Comparator;

public class HappinessApplication {
    public static void main(String[] args) {
        new FileReader().asStream("exercises/week09/ex04/world-happiness-2017.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new HappinessRecord(e[0], Integer.valueOf(e[1]), Double.valueOf(e[2])))
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(5)
                .forEach(e -> System.out.println("Rank: " + e.getRank() + " | Country: " + e.getCountry() + " | Score: " + e.getScore()));
    }
}
