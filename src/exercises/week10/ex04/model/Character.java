package exercises.week10.ex04;

public class Character {
    private String name;
    private String allegiances;
    private String deathYear;
    private String bookOfDeath;
    private String deathChapter;
    private String BookIntroChapter;
    private String gender;
    private String nobility;

    public Character(String name, String allegiances, String deathYear, String bookOfDeath,
                     String deathChapter, String bookIntroChapter, String gender, String nobility) {
        this.name = name;
        this.allegiances = allegiances;
        this.deathYear = deathYear;
        this.bookOfDeath = bookOfDeath;
        this.deathChapter = deathChapter;
        BookIntroChapter = bookIntroChapter;
        this.gender = gender;
        this.nobility = nobility;
    }

    public String getName() {
        return name;
    }

    public String getAllegiances() {
        return allegiances;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    public String getDeathChapter() {
        return deathChapter;
    }

    public String getBookIntroChapter() {
        return BookIntroChapter;
    }

    public String getGender() {
        return gender;
    }

    public String getNobility() {
        return nobility;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", allegiances='" + allegiances + '\'' +
                ", deathYear='" + deathYear + '\'' +
                ", bookOfDeath='" + bookOfDeath + '\'' +
                ", deathChapter='" + deathChapter + '\'' +
                ", BookIntroChapter='" + BookIntroChapter + '\'' +
                ", gender='" + gender + '\'' +
                ", nobility='" + nobility + '\'' +
                '}';
    }
}
