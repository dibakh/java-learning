package exercises.week08.robomim;

public class ExclamationDecryptor implements Decryptor {

    @Override
    public String decriptor(String line) {
        line = line.replace("!", "");
        return line;
    }

    @Override
    public Boolean isThere(String line) {
        return line.contains("!");
    }


}
