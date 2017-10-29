package by.epam.jb.homework1_1.hw1_7;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args){
        double a, b, c, d, e, f, g;

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

        if (a > b){
            System.out.print("Введите c: ");
            while (!sc.hasNextDouble()){
                sc.next();
            }
            c = sc.nextDouble();

            d = a + b + c;
            System.out.println(d);
        }

        if (a == b){
            System.out.println("Конец");
        }

        if (a < b){
            System.out.print("Введите c: ");
            while (!sc.hasNextDouble()){
                sc.next();
            }
            c = sc.nextDouble();

            d = a + b + c;
            System.out.println(d + "Новый год!");
        }
    }
}
