import java.util.Scanner;

public class threprim implements Runnable {
    private int number;

    public threprim(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int m = number / 2;
        int flag = 0;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                throw new Exception("Invalid input");
            }
            Thread t = new Thread(new prime(number));
            t.start();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
