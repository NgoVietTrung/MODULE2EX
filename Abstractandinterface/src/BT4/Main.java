package BT4;

public class Main{
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(3,"red",true);
        shapes[1]=new Rectangle(4,5,"blue",true);
        shapes[2]=new Square(5,"red",true);
        System.out.println("Before resize:");
        for(Shape shape:shapes){
            System.out.println(shape.toString());
        }
        System.out.println("Area After resize:");
            Shape shape1= (Circle) shapes[0];
            System.out.printf("%.2f\n",((Circle) shape1).reSize());
            Shape shape2=(Rectangle) shapes[1];
            System.out.printf("%.2f\n",((Rectangle) shape2).reSize());
            Shape shape3=(Square) shapes[2];
            System.out.printf("%.2f\n",((Square) shape3).reSize());
        }

    }

