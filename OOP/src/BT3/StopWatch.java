package BT3;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
    public void start(){
        this.startTime=LocalTime.now();
        getStartTime();
    }
    public void end(){
        this.endTime=LocalTime.now();
        getEndTime();
    }
    public void getElapseTime(){
        int ElapseTime=startTime.toSecondOfDay()-endTime.toSecondOfDay();
        System.out.println(ElapseTime);
    }
}
