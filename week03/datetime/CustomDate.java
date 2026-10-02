package datetime;

public class CustomDate {
    int month;
    int day;
    int year;

    public CustomDate(int month, int day, int year){
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public void setMonth(int month){
        if(month<1 || month>12){
            System.out.println("Invalid month: "+ month);
            month = 1;
        }
        this.month=month;
    }
    int getMonth(){
        return month;
    }
    public void setDay(int day){
        if(day<1 || day > daysInMonths(this.month, this.year)){
            day =1;
        }
        this.day=day;
    }
    int getDay(){
        return day;
    }
    public void setYear(int year){
        this.year=year;
    }
    int getYear(){
        return year;
    }
    //leap year check
    public static boolean isLeapYear(int year){
        return (year%4==0 && year%100!=0) || (year%400==0);
    }
    private static int daysInMonths(int month, int year){
        switch(month){
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }

    }
    public String DisplayDate(){
        return month + "/" + day + "/" + year;
    }

    public int difference(CustomDate date){
        double differenceIndays = (this.day + this.month*30+ this.year*365.25) - (date.day+ date.month*30+ date.year*365.25) ;
        return (int) Math.abs(differenceIndays);
    }

    public static int compare(CustomDate date1, CustomDate date2){
        if (date1.year > date2.year) {
            return -1;
        } else if (date1.year < date2.year) {
            return 1;
        } else {
            if (date1.month > date2.month) {
                return -1;
            } else if (date1.month < date2.month) {
                return 1;
            } else {
                if (date1.day > date2.day) {
                    return -1;
                } else if (date1.day < date2.day) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
    public String DisplayFormatted(){
        String the_month = null;
        switch(this.month){
            case 1 -> the_month= "Jan";
            case 2 -> the_month= "Feb";
            case 3 -> the_month= "Mar";
            case 4 -> the_month= "Apr";
            case 5 -> the_month= "May";
            case 6 -> the_month= "Jun";
            case 7 -> the_month= "Jul";
            case 8 -> the_month= "Aug";
            case 9 -> the_month= "Sep";
            case 10 -> the_month= "Oct";
            case 11 -> the_month= "Nov";
            case 12 -> the_month= "Dec";
            }
            return this.day + " " + the_month + " " + this.year;

        }
    }



