package BT2;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1=new Car("Honda","Yokohama");
        System.out.print(Car.numberofcar+" ");
        System.out.println(car1.display());
        Car car2=new Car("Yamaha","Blue Core");
        System.out.print(Car.numberofcar+" ");
        System.out.println(car2.display());
    }
}
