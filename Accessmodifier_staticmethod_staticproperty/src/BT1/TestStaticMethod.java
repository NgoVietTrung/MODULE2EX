package BT1;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student1=new Student(1,"Phap chu be dan");
        Student student2=new Student(2,"Thanh chu be hoi dan");
        Student student3=new Student(3,"Trung chu be khon");
        student1.display();
        student2.display();
        student3.display();
    }
}
