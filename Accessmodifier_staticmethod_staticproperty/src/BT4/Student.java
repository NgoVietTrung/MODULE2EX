package BT4;

public class Student {
    private String name="John";
    private String classes="CO2";
    public Student(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String display(){
        return name+" "+classes;
    }
}
