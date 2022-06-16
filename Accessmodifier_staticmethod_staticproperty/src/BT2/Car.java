package BT2;

public class Car {
    private String name;
    private String engine;
    public static int numberofcar;
    public Car(String n,String e){
        name=n;
        engine=e;
        numberofcar++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }
    public String display(){
        return name+" "+engine;
    }
}
