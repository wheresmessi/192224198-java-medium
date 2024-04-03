import java.util.Scanner;

public class b_fibonacci implements Runnable {
    private int limit;

    public b_fibonacci(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        int a = 0, b = 1, c = 0;
        System.out.println("Fibonacci series:");
        for (int i = 0; i < limit; i++) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Limit for Fibonacci: ");
            int limit = sc.nextInt();
            if (limit < 0) {
                throw new Exception("Invalid input");
            }
            Thread t = new Thread(new b_fibonacci(limit));
            t.start();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
