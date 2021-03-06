package exercises.week09.ex05;

public class Film {
    private String title;
    private Double score;
    private Long voteCount;
    private Integer runtime;
    private Long budget;
    private Long revenue;

    public Film(String title, Double score, Long voteCount, Integer runtime, Long budget, Long revenue) {
        this.title = title;
        this.score = score;
        this.voteCount = voteCount;
        this.runtime = runtime;
        this.budget = budget;
        this.revenue = revenue;
    }
//    reate the Film class that has a title, a score, a vote count, a runtime, a budget and a revenue.

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Long getBudget() {
        return budget;
    }

    public Long getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", score=" + score +
                ", voteCount=" + voteCount +
                ", runtime=" + runtime +
                ", budget=" + budget +
                ", revenue=" + revenue +
                '}';
    }
}