package exercises.week01.ex01;

public class Article {
    private String text;
    private String title;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {

        return title;
    }
    public String getText() {
        return text;
    }

}
