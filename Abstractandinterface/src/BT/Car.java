package BT;

public class Car extends Machine implements Runable{
    @Override
    public void setName(String name) {
        super.setName(name);
    }


    public void Runable() {
        System.out.println(getName() + " Run on 4 wheels");
    }

    @Override
    public String toString() {
        System.out.println(getName() + " is a Car.");
        Runable();
        return super.toString();
    }
}
