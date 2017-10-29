package by.epam.jb.homework1_2.hw10;
import java.util.Scanner;
import java.math.BigDecimal;
import static java.lang.Math.pow;
public class Task10 {
    public static void main(String[] args) {

        double x ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите  значение x");
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        x = sc.nextDouble();


        if (x<=-3){
            System.out.println("F(x) = 9");
        } else {
            if (x>3){

                BigDecimal y = new BigDecimal(1/(pow(x,2)+1));
                System.out.println("F(x) = " + y.doubleValue());
            }else{
                System.out.println("Нет решений");
            }
        }
    }
}
