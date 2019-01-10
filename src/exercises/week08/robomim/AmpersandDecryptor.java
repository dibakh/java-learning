package exercises.week08.robomim;

public class AmpersandDecryptor implements Decryptor {

    @Override
    public String decriptor(String line) {
        line = line.replace("&", "");
        line = reverse(line);
        return line;
    }

    @Override
    public Boolean isThere(String line) {


        return line.contains("&");
    }


    private String reverse(String line) {
        String reverse = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            reverse = reverse + line.charAt(i);
        }
        return reverse;
    }
}
