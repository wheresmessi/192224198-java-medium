import java.util.*;

public class multiplicationtable5and10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of a and b:");
        int a = s.nextInt();
        int b = s.nextInt();

        Runnable table5 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(a + " X " + i + " = " + (a * i));
            }
        };

        Runnable table10 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(b + " X " + i + " = " + (b * i));
            }
        };

        Thread t1 = new Thread(table5);
        Thread t2 = new Thread(table10);

        t1.start();
        t2.start();
    }
}
