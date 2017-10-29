package by.epam.jb.homework2_2.Task3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String monthNum = null;
        Month month;

        System.out.print("номер месяца: ");
        monthNum = sc.next();

        monthNum = monthNum.toUpperCase();

        month = Month.valueOf(monthNum);


        switch (month) {
            case TRHEE:
            case FOUR:
            case FIVE:
                System.out.println("spring");
                break;
            case SIX:
            case SEVEN:
            case EIGHT:
                System.out.println("summer");
                break;
            case NINE:
            case TEN:
            case ELEVEN:
                System.out.println("autumn");
                break;
            case ONE:
            case TWO:
            case TWELVE:
                System.out.println("winter");
                break;
            default:
                System.out.println("несуществующий месяц");


        }

    }

    public enum Month {
        ONE, TWO, TRHEE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE
    }
}
