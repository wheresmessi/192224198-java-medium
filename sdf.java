import java.util.Scanner;

class CheckPalindrome {
    public static void main(String[] args) {
        try {
            int a, rev = 0, rem, choice;
            String a1, b = "";
            Scanner sc = new Scanner(System.in);
            System.out.println("Case:");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the string:");
                    a1 = sc.next();
                    int d = a1.length();
                    for (int i = d - 1; i >= 0; i--) {
                        b = b + a1.charAt(i);
                    }
                    if (a1.equals(b)) {
                        System.out.println("PALINDROME");
                    } else {
                        System.out.println("NOT A PALINDROME");
                    }
                    break;
                }
                case 2: {

                    System.out.println("Enter a number:");
                    a = sc.nextInt();
                    int d1 = a;
                    while (a != 0) {
                        rem = a % 10;
                        rev = rev * 10 + rem;
                        a = a / 10;
                    }
                    if (d1 == rev) {

                        System.out.println("PALINDROME");
                    } else {

                        System.out.println("NOT A PALINDROME");
                    }
                    break;
                }
                default: {

                    System.out.println("Executed");
                }
            }
        } catch (Exception e) {
            System.out.print("Enter only numbers");
        }
    }
}
