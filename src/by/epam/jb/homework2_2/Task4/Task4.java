package by.epam.jb.homework2_2.Task4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String monthNum;
        Month month;
        System.out.print("номер месяца: ");
        monthNum = sc.next();

        monthNum = monthNum.toUpperCase();

        month = Month.valueOf(monthNum);

        if (month == Month.TRHEE || month == Month.FOUR || month == Month.FIVE) {
            System.out.println("spring");
        } else {
            if (month == Month.SIX || month == Month.SEVEN || month == Month.EIGHT) {
                System.out.println("summer");
            } else {
                if (month == Month.NINE || month == Month.TEN || month == Month.ELEVEN) {
                    System.out.println("autumn");
                } else {
                    if (month == Month.ONE || month == Month.TWO || month == Month.TWELVE) {
                        System.out.println("winter");
                    } else {
                        System.out.println("несуществующий месяц");
                    }
                }

            }

        }

    }
    public enum Month {
        ONE, TWO, TRHEE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE
    }

}
