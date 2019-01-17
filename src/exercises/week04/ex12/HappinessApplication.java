package exercises.week04.ex12;

import reflection.week07.FileReader;

import java.util.*;

public class HappinessApplication {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        List<String> lines = fileReader.asLines("exercises/week09/ex04/world-happiness-2017.csv");
        lines.remove(0);
        List<HappinessRecord> happinessRecords = toHappinessRecords(lines);

        Collections.sort(happinessRecords, Comparator.comparing(HappinessRecord::getRank));

        for (int times = 0; times < 5; times++) {
            HappinessRecord happinessRecord = happinessRecords.get(times);
            System.out.println(happinessRecord.getCountry() +
                    " | " + happinessRecord.getRank() +
                    " | " + happinessRecord.getScore());
        }
    }

    private static List<HappinessRecord> toHappinessRecords(List<String> lines) {
        List<HappinessRecord> happinessRecords = new ArrayList<>();
        for (String line : lines) {
            HappinessRecord happinessRecord = toHappinessRecords(line);
            happinessRecords.add(happinessRecord);
        }
        return happinessRecords;
    }

    private static HappinessRecord toHappinessRecords(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String country = columns.get(0);
        Integer rank = Integer.valueOf(columns.get(1));
        Double score = Double.valueOf(columns.get(2));
        return new HappinessRecord(country, rank, score);
    }

}




