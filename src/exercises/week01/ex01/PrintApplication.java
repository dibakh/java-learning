package exercises.week01.ex01;

public class PrintApplication {
    public static void main(String[] args) {
        Article article = new Article("Title", "Text");
        Printer printer = new Printer();
        printer.print(article);
    }
}

