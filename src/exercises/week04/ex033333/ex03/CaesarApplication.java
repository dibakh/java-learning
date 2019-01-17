package exercises.week04.ex12.ex033333.ex03;

import exercises.week09.ex03.Caesar;

public class CaesarApplication {
    public static void main(String[] args) {
        exercises.week09.ex03.Caesar caesar = new Caesar();
        String encryptedMessage = caesar.encrypt("Hello, World! ", 13);
        System.out.println(encryptedMessage);
    }
}
