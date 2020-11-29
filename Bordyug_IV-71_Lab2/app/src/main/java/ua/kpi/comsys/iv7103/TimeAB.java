package ua.kpi.comsys.iv7103;

import java.sql.Time;

//task 3 : AB = Bordyug Alexander Group IV-71
public class TimeAB {
    //task 4
    private int hours, minutes, seconds;

    //task 5 constructor 1
    public TimeAB(){
        hours = minutes = seconds = 0;
    }

    //task 5 constructor 2
    public TimeAB(int hours, int minutes, int seconds) throws Exception {
        if(hours < 0 || hours > 23) throw new Exception("Incorrect hours");
        if(minutes < 0 || minutes > 59) throw new Exception("Incorrect minutes");
        if(seconds < 0 || seconds > 59) throw new Exception("Incorrect seconds");

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    //task 5 constructor 3
    public TimeAB(Time time){
        this.hours = time.getHours();
        this.minutes = time.getMinutes();
        this.seconds = time.getSeconds();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    //task 6 method 1
    @Override
    public String toString() {
        return (((hours > 12 ) ? hours - 12 : hours) + ":" + minutes + ":" + seconds + " " + ((hours > 12 ) ? "PM" : "AM"));
    }

    //task 6 method 2
    public TimeAB sum (TimeAB timeAB) throws Exception {
        Time date1 = new Time(this.hours, this.minutes, this.seconds);
        Time date2 = new Time(timeAB.getHours(), timeAB.getMinutes(), timeAB.getSeconds());

        long sum = (date1.getTime() + date2.getTime() + 10800000);
        Time sumDate = new Time(sum);

        return new TimeAB(sumDate.getHours(),
                sumDate.getMinutes(),
                sumDate.getSeconds());
    }

    // task 6 method 3
    public TimeAB diff (TimeAB timeAB) throws Exception {
        Time date1 = new Time(this.hours, this.minutes, this.seconds);
        Time date2 = new Time(timeAB.getHours(), timeAB.getMinutes(), timeAB.getSeconds());

        long sum = (date1.getTime() - date2.getTime() - 10800000);
        Time sumDate = new Time(sum);

        return new TimeAB(sumDate.getHours(),
                sumDate.getMinutes(),
                sumDate.getSeconds());
    }

    //task 7 class method 1
    public static TimeAB sum (TimeAB time1, TimeAB time2) throws Exception {
        Time date1 = new Time(time1.hours, time1.minutes, time1.seconds);
        Time date2 = new Time(time2.hours, time2.minutes, time2.seconds);

        long sum = (date1.getTime() + date2.getTime() + 10800000);
        Time sumDate = new Time(sum);

        return new TimeAB(sumDate.getHours(),
                sumDate.getMinutes(),
                sumDate.getSeconds());
    }

    //task 7 class method 2
    public static TimeAB diff (TimeAB time1, TimeAB time2) throws Exception {
        Time date1 = new Time(time1.hours, time1.minutes, time1.seconds);
        Time date2 = new Time(time2.hours, time2.minutes, time2.seconds);

        long sum = (date1.getTime() - date2.getTime() - 10800000);
        Time sumDate = new Time(sum);

        return new TimeAB(sumDate.getHours(),
                sumDate.getMinutes(),
                sumDate.getSeconds());
    }
}
