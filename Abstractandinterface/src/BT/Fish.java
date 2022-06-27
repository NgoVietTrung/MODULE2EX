package BT;

public class Fish extends Animal implements Swimable{
    @Override
    public void setName(String name) {
        super.setName(name);
    }


    public void Swimable() {
        System.out.println(getName() + " can swim under water");
    }

    @Override
    public String toString() {
        System.out.println( getName() + " is a Fish.");
        Swimable();
        return super.toString();
    }
}
