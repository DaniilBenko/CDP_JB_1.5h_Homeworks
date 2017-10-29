package by.epam.jb.homework2_2.Task2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        String month = null;
        int year = 0;
        int numDays = 0;

        month = eMonth(month);
        year = eYear(year);
        numDays = cDays(year, numDays, month);
        DaysNumber(numDays, month);
    }


    public static String eMonth(String month) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month: ");
        month = sc.nextLine();
        return month;
    }


    public static int eYear(int year) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        year = sc.nextInt();
        return year;
    }


    public static int cDays(int year, int numDays, String month) {
        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                numDays = 31;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                numDays = 30;
                break;
            case "February":
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
        }
        return numDays;
    }

    public static void DaysNumber(int numDays, String month) {
        if (numDays != 28 && numDays != 29 && numDays != 30 && numDays != 31) {
            System.out.println("Несуществующий месяц");
        } else {
            System.out.println(month + " has " + numDays + " days");
        }
    }
}
