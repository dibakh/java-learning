package exercises.week01.ex01;

import exercises.week01.ex05.Magazine;

import java.util.List;


public class Printer {
    public void print(Article article) {
        System.out.println("Article text is = " + article.getText());
        System.out.println("Text is = " + article.getTitle());
    }

    public void printMagazine(Magazine magazine) {
        System.out.println("Magazine title: " + magazine.getTitle());
        List<Article> articles = magazine.getArticles();
        for (Article article : articles) {
            print(article);
        }
    }
}