package abstractClassAndInterface;

public class Door1 implements Door {
    @Override
    public void open() {
        System.out.println("111111");
    }

    @Override
    public void close() {
        System.out.println("222222");
    }

    public static void main(String[] args) {
        System.out.println(Door.name);
        Door1 door1 = new Door1();
        door1.close();
        door1.open();

    }
}
