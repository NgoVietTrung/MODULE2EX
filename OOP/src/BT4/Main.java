package BT4;

public class Main {
    public static void main(String[] args) {
        Fan fan1=new Fan(true,10,"yellow");
        fan1.setSpeed(fan1.getFAST());
        System.out.println(fan1.toString());
        Fan fan2=new Fan(false,5,"blue");
        fan2.setSpeed(fan2.getMEDIUM());
        System.out.println(fan2.toString());
    }
}
