//The goal of this exercise is to program the basic functionality of a Clock. Each instance of a clock should be made by giving it the hour, minute and second or the total number of seconds. In the second case, this should be properly converted to the associated hours, minutes and seconds.
//
//We expect the following functionalities to be available in your class:
//
//The time of the clock can be increased by 1 second with the tick() method.
//The total time in number of seconds is given by timeInSeconds()
//Displaying the time is done with the displayTime() method. The output is expected to be "The time is:" followed by a new line, on the second line we expect the time in the following format: "hh:mm:ss"
//No main() method is needed for this exercise!


package WPO2;

public class Clock {
    private int hour;
    private int minute;
    private int seconds;
    private int totalSeconds;


    public Clock(int hour, int minute, int seconds){
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public Clock(int totalSeconds){
        this(totalSeconds/3600, totalSeconds/60, totalSeconds%60);
    }

    public int timeInSeconds(){
        return hour*3600+minute*60+seconds;
    }

    public void tick(){
        seconds += 1;
        if (seconds == 86400){
            seconds = 0;
        }
    }

    public void displayTime(){
        System.out.println("The time is");
        System.out.println(" "+hour+":"+minute+":"+seconds);

    }



}
