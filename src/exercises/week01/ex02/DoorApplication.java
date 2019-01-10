package exercises.week01.ex02;

public class DoorApplication {
    public static void main(String[] args) {
        Door door = new Door(12);
        Key key = new Key();
        key.open(door);
    }
}

