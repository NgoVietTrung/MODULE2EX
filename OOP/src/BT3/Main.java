package BT3;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.end();
        for (int i=1;i<1000000;i++){
            stopWatch.start();
            stopWatch.getElapseTime();
        }
    }
}
