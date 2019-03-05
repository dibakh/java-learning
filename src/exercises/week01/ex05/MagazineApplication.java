package Ex05;


import Ex01.Printer;

public class MagazineApplication {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Magazine magazine = editor.writeMagazine();

        Printer printer = new Printer();
        printer.printMagazine(magazine);
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