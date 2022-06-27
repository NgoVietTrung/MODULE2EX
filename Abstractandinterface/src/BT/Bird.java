package BT;

public class Bird extends Animal implements Flyable {
    @Override
    public void setName(String name) {
        super.setName(name);
    }


    public void Flyable() {
        System.out.println(getName() + " can fly");
    }

    @Override
    public String toString() {
        System.out.println( getName() + " is a Bird.");
        Flyable();
        return super.toString();
    }

}
