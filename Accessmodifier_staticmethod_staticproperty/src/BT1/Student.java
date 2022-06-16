package BT1;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";
    public Student(int r, String n){
        rollno=r;
        name=n;
    }
    static void  change(){
        college="CODGEYM";
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
