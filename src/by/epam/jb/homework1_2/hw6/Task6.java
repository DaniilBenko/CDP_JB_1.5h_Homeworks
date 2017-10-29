package by.epam.jb.homework1_2.hw6;
import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class Task6 {
    public static void main(String[] args) {

        double a, b, c, d, e, f ;
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

        System.out.println("Введите  значение c");
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        c = sc.nextDouble();


        System.out.println("Введите значение d");
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        d = sc.nextDouble();

        e= (b+sqrt(pow(b,2)+4*a*c)/2*a)-(pow(a,3)*c+b);
        f= (a/c)*(b/d)-((a*b-c)/c*d);

        System.out.println("выражение 1 => " + e);
        System.out.println("выражение 2  => " + f);

    }
}
