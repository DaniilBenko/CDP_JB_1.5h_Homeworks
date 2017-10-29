package by.epam.jb.homework1_2.hw9;
import java.util.Scanner;
import java.math.BigDecimal;
import static java.lang.Math.pow;
import static java.lang.Math.PI;
public class Task9 {
    public static void main(String[] args) {
        double r;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите  значение радиуса");
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        r = sc.nextDouble();

        BigDecimal y = new BigDecimal(2*PI*r);
        System.out.println("длина окружности " + y.doubleValue());


        BigDecimal x = new BigDecimal(PI*pow(r,2));
        System.out.println("площадь круга " + x.doubleValue());
    }
}
