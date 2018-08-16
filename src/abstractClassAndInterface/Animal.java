package abstractClassAndInterface;

public abstract class Animal {

    private String name;

    private String sex;

    public void run(){
        System.out.println("111111111");
    }

    public abstract void cry();

    public static void say(){
        System.out.println("2222222");
    }

    public static void main(String[] args) {

        Animal animal = new Animal() {
            @Override
            public void cry() {

            }
        };
        Animal.say();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
