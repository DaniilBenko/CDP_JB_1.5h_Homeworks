package by.epam.jb.homework2_1.Task2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int x;
        int y;
        int sum, mul;
        x=Vvod();
        y=Vvod();

        sum = x + y;
        mul = x * y;
        System.out.println("sum = " + sum + "; mul = " + mul);
    }


    public static int Vvod (){
        int ch;
        Scanner conin = new Scanner(System.in);
        System.out.println("Введите число: ");
        while (!conin.hasNextInt()) {
            conin.next();
        }
        return ch= conin.nextInt();
    }
}
