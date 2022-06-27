package BT;

public class Dog extends Animal implements Runable,Barkable {
    @Override
    public void setName(String name) {
        super.setName(name);
    }


    public void Runable() {
        System.out.println(getName() + " run on 4 legs");
    }

    public void Barkable() {
        System.out.println(getName() + " backing woof woof");
    }

    @Override
    public String toString() {
        System.out.println(getName() + "is a Dog");
        Runable();
        Barkable();
        return super.toString();
    }
}