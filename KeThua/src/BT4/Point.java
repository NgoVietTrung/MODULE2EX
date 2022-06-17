package BT4;

public class Point {
    float x;
    float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float array[]= {x,y};
        return array;
    }

    public String toString() {
        return "Point "+this.x+","+this.y;
    }

    public static void main(String[] args) {
        Point point=new Point(3,4);
        System.out.println(point);
    }
}

