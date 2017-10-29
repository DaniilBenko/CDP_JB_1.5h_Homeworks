package by.epam.jb.homework1_1.hw1_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double a, b; // катеты
        double c = 0; // гипотенуза
        double p; // периметр
        double s; // площадь
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длинну катета a: ");
        while (!sc.hasNextInt()){
            sc.next();
        }
        a = sc.nextInt();

        System.out.print("Введите длинну катета b: ");
        while (!sc.hasNextInt()){
            sc.next();
        }
        b = sc.nextInt();

        c = Math.sqrt(a * a + b * b);
        p = a + b + c;
        s = 0.5 * a * b;

        System.out.println("Периметр = " + p + " площадь = " + s);
    }
}
