package by.epam.jb.homework1_1.hw1_6;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        double a, b, c, d, e, f, g;
        double Power = 2;

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

        d = Math.pow(a, Power); //a^2
        e = Math.pow((b - c), Power); //(b - c)^2
        f = Math.pow(b, Power); //b^2
        g = d - e + Math.log(f+1);
        System.out.println(g);
}}
