package by.epam.jb.homework1_2.hw8;
import java.util.Scanner;
import static java.lang.Math.tan;
public class Task8 {
    public static void main(String[] args) {

        double a, b, h, x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите  значение а");
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        a = sc.nextDouble();

        System.out.println("Введите  значение b");
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        b = sc.nextDouble();

        System.out.println("Введите  шаг");
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        h = sc.nextDouble();
        System.out.println("x" + "      F(x)");
        while(a<=b)
        {
            System.out.print(a + "  ");
            x=2*tan(a/2)+1;
            System.out.println(x);
            a=a+h;
        }

    }
}
