package method;

public class Car implements Vehicle , FourWheeler {
    @Override
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
    }
//    @Override
//    public void print() {
//        System.out.println("我是一辆四轮汽车!");
//    }
}