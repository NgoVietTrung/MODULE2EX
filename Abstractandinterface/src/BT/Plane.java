package BT;

public class Plane extends Machine implements Flyable{
    public void setName(String name) {
        super.setName(name);
    }

    public void Flyable() {
        System.out.println(getName() + " Flying with an engine.");
    }

    public void run() {
        System.out.println(getName()+ " Run on one front wheel and two rear wheels");
    }

    @Override
    public String toString() {
        System.out.println("AirPlane Model is: " + getName());
        run();
        Flyable();
        return super.toString();
    }
}
