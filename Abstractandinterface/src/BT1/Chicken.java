package BT1;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "Chicken: o o o";
    }

    public String howtoEat() {
        return "Fried Chicken";
    }
}
