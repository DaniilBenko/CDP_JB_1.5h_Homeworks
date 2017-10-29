package by.epam.jb.homework1_1.hw1_5;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        double a, b, c, d, s;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите a: ");
        while (!sc.hasNextDouble()){
            sc.next();
        }
        a = sc.nextDouble();

        System.out.print("Введите b: ");
        while (!sc.hasNextDouble()){
            sc.next();
        }
        b = sc.nextDouble();

        System.out.print("Введите c: ");
        while (!sc.hasNextDouble()){
            sc.next();
        }
        c = sc.nextDouble();

        System.out.print("Введите d: ");
        while (!sc.hasNextDouble()){
            sc.next();
        }
        d = sc.nextDouble();

        s = a + b + c + d;

        System.out.println("Сумма равна = " + s);
    }
}
