package Ex01;

import Ex05.Magazine;

import java.util.List;

public class Printer {

    public void print(Article article) {
        System.out.println("Article text is = " + article.getText());
        System.out.println("Text is = " + article.getTitle());
    }


//    Matilda has finished writing an article and wants to print it.
//        Develop the code that she uses to write an article and print it.
//        Follow the instructions below:
//        You need the following classes: Article, Printer and PrintApplication.
//        An Article has a title and a text. It also has the methods getTitle and getText.

//        A Printer can print an article, which means it just writes the title and the text on the screen.

//        In the PrintApplication class main method, create an Article and a Printer and print the article with the printer.


    public void printMagazine(Magazine magazine) {
        System.out.println("Magazine title: " + magazine.getTitle());
        List<Article> articles = magazine.getArticles();
        for (Article article : articles) {
            print(article);
        }
    }
//    You need the following classes: Article, Magazine, Editor, Printer and MagazineApplication.
//        Reuse the Article from exercise 1 (don’t copy it, reuse the existing one from the package where it already is).
//        A Magazine has a title and a list of Article. Its constructor only asks for the title. Make sure its articles are initialized with an empty collection. It also has the method add to add an Article to its list and the method getArticles that returns the list. It also has the method getTitle.
//        An Editor has no attributes. It has the writeMagazine method that returns a Magazine. In order to create a Magazine it creates first three Articles, it adds them to the Magazine and then it returns it.
//        Reuse the Printer from exercise 1 (don’t copy it, reuse the existing one from the package where it already is). Add the new method printMagazine to the Printer that receives a Magazine and displays its title and then all the articles.

//        In the MagazineApplication class main method,
//          create an Editor,
//          use it to write a Magazine,
//          create a Printer and use it to print a preview of the Magazine.

}