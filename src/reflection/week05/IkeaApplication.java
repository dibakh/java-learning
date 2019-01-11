package reflection.week05;


public class IkeaApplication {
    public static void main(String[] args) {
        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        TvTable tvTable = tvTableBuilder.build();

        System.out.println(tvTable);
    }
}

