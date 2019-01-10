package exercises.week08.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class AgeRange {
    public List<String> underAge(List<String> nameOfMembers, List<Integer> ageOfMembers) {
        return filterMembers(nameOfMembers, ageOfMembers, age -> age < 18);
    }

    public List<String> aboveAge(List<String> nameOfMembers, List<Integer> ageOfMembers) {
        return filterMembers(nameOfMembers, ageOfMembers, age -> age >= 18);
    }

    private List<String> filterMembers(List<String> nameOfMembers, List<Integer> ageOfMembers, Function<Integer, Boolean> furmola) {
        List<String> aboveAgeMembers = new ArrayList<>();
        for (int position = 0; position < nameOfMembers.size(); position++) {
            if (furmola.apply(ageOfMembers.get(position))) {
                aboveAgeMembers.add(nameOfMembers.get(position));
            }
        }
        return aboveAgeMembers;
    }
}
