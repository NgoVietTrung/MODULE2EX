package BT5;


public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(3);
        shapes[1]=new Rectangle(3.0,5,"red",false);
        shapes[2]=new Square(2,"blue",true);
        for(Shape shape: shapes){
            System.out.println(shape.toString());
            if (shape instanceof Square){
                Colorable colorable = (Square) shape;
                colorable.howtoColor();
            }
        }

    }
}

