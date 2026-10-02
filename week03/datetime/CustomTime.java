package datetime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public CustomTime(){
        this.hour =0;
        this.minute=0;
        this.second=0;
    }
    public CustomTime(int hour){
        this.hour = hour;
        this.minute=0;
        this.second=0;
    }
    public CustomTime(int hour, int minute){
        this.hour = hour;
        this.minute=minute;
        this.second=0;
    }

    public CustomTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public CustomTime(CustomTime time){
        this.hour = time.hour;
        this.minute= time.minute;
        this.second = time.second;
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

     public String toUniversalString(){
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
 
    // H:MM:SS AM/PM
    public String toStandardString(){
        int displayHour = this.hour % 12;
        if (displayHour == 0) {
            displayHour = 12;   // 0 -> 12 AM, 12 -> 12 PM
        }
        String period = (this.hour < 12) ? "AM" : "PM";
        return displayHour + ":" + String.format("%02d:%02d", this.minute, this.second) + " " + period;
    }





}
