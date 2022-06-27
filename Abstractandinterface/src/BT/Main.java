package BT;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setName("Chu be dan");
        dog.toString();
        Animal bird = new Bird();
        bird.setName("Chim trang mo coi");
        bird.toString();
        Animal fish = new Fish();
        fish.setName("Ca he");
        fish.toString();
        Machine car = new Car();
        car.setName("Ford");
        car.toString();
        Machine plane = new Plane();
        plane.setName("May bay ba gia");
        plane.toString();
    }
}


