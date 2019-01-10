package exercises.week08.robomim;

public class HashtagDecryptor implements Decryptor {
    @Override
    public String decriptor(String line) {
        line = line.replace("#", "");
        line = line.replace("robomim", "");
        return line;
    }

    @Override
    public Boolean isThere(String line) {
        return line.contains("#");
    }
}
