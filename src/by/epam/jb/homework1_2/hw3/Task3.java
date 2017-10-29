package by.epam.jb.homework1_2.hw3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        int a=0, c=0, d=0, e=0;
        double b=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество чисел");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        a = sc.nextInt();
        System.out.println("Введите " + a + " вещественных чисел (через ',')");
        for (int i = 0; i < a; i++) {

            while (!sc.hasNextDouble()) {
                sc.next();
            }
            b = sc.nextDouble();
            c=(int)b;

            if (c % 2 == 0) {
                d++;
            }
            if (c>15){
                e++;
            }

        }
        System.out.println("четных => " + d);
        System.out.println(">15 => " + e);

    }
}
