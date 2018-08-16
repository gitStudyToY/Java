package abstractClassAndInterface;

public class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("33333");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        Animal.say();
        dog.cry();
    }
}
