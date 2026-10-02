package datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate d1 = new CustomDate(3, 15, 2024);
        CustomDate d2 = new CustomDate(12, 1, 2020);

        System.out.println("d1 = " + d1.DisplayDate());
        System.out.println("d2 = " + d2.DisplayDate());

        System.out.println("d1 formatted: " + d1.DisplayFormatted());
        System.out.println("d2 formatted: " + d2.DisplayFormatted());

        System.out.println("difference in days: " + d1.difference(d2));

        System.out.println("compare(d1, d2) = " + CustomDate.compare(d1, d2)); // d1 is later 
        System.out.println("compare(d2, d1) = " + CustomDate.compare(d2, d1)); // d2 is earlier 
        System.out.println("compare(d1, d1) = " + CustomDate.compare(d1, d1)); // same 

        CustomDate leapDay = new CustomDate(2, 29, 2024); 
        System.out.println("leapDay = " + leapDay.DisplayDate());

        CustomDate notLeapDay = new CustomDate(2, 29, 2023); // 2023 is NOT a leap year
        System.out.println("notLeapDay (should default day to 1) = " + notLeapDay.DisplayDate());

        CustomDate badMonth = new CustomDate(14, 5, 2024); // invalid month
        System.out.println("badMonth (should default month to 1) = " + badMonth.DisplayDate());
    }
}