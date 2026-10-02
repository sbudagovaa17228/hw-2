package datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime onevar = new CustomTime(2);
        System.out.println("hour:" + onevar.getHour() + " min:" + onevar.getMinute() + " sec:" + onevar.getSecond());
        CustomTime twovar = new CustomTime(3, 20);
        System.out.println("hour:" + twovar.getHour() + " min:" + twovar.getMinute() + " sec:" + twovar.getSecond());
        CustomTime threevar = new CustomTime(3, 20, 50);
        System.out.println("hour:" + threevar.getHour() + " min:" + threevar.getMinute() + " sec:" + threevar.getSecond());
        
        System.out.println("Universal time: " + threevar.toUniversalString());
        CustomTime time2 = new CustomTime(15, 45, 23);
        System.out.println("Standard time: " + time2.toStandardString());
        System.out.println("standard time: " + threevar.toStandardString());
        
    }
}
