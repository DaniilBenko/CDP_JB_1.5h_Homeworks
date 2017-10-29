package by.epam.jb.homework1_2.hw4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        int a=0, b=0, c=0, d=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите  количество чисел");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        a = sc.nextInt();
        System.out.println("Введите " + a + "целых чисел");
        for (int i = 0; i < a; i++) {

            while (!sc.hasNextInt()) {
                sc.next();
            }
            b = sc.nextInt();

            if (15>b | b>2) {
                c++;
            }
            if (b % 5 == 4){
                d=d+b;
            }


        }
        System.out.println("больше 15 или меньше 2 => " + c);
        System.out.println("сумма чисел, которые делятся на 5 с остатком 4  => " + d);

    }
}
