package exercises.week07.ex06;

import java.util.List;
import java.util.Scanner;

public class SecretHandshakesApplication {
    public static void main(String[] args) {
        SecretHandshakeMovesTranslator translator = new SecretHandshakeMovesTranslator();

        System.out.println("please enter the price : ");

        Scanner scanner = new Scanner(System.in);
        Integer price = scanner.nextInt();

        List<String> secretMoves = translator.translatePrice(price);

        System.out.println("secret moves are : " + secretMoves);

    }
}
