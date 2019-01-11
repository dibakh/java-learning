package reflection.week05;

public class AddTop implements Step {

    @Override
    public void perform(Furniture wardrobe) {
        wardrobe.add("top");
    }
}
