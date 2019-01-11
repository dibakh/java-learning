package reflection.week05;

import java.util.ArrayList;
import java.util.List;

public class TvTableBuilder {
    private List<Step> steps = new ArrayList<>();


    public TvTable build() {
        TvTable tvTable = new TvTable();
        List<Step> steps = getSteps();
        for (Step step : steps) {
            step.perform(tvTable);
        }
        return tvTable;
    }

    public List<Step> getSteps() {
        addOneStep(new AddLegs(), 4);
        addOneStep(new AddShelf(), 1);
        addOneStep(new AddTop(), 1);
        return steps;
    }

    private void addOneStep(Step step, Integer times) {
        for (int time = 0; time < times; time++) {
            steps.add(step);
        }
    }
}
