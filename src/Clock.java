/**
 * Created by eesn on 13.05.16.
 */
public class Clock {
    String time;
            void setTime(String t) {
                time=t;
            }
    void getTime() {
        return time;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.get.time();
        System.out.println("time: " + tod);
    }
}