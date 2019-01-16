package exercises.week07.ex05;

import java.util.Scanner;

public class Palindrome {

    public static void recieve() {
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        System.out.println("enter the word : ");

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if (checkPalindrome.check(word)){
            System.out.println( " the word is palindrome! ");
        }else{
            System.out.println(" the word is not polindrome! ");
        }
    }
}
