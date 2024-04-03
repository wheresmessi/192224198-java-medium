import java.util.*;

class Salary {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter salary of an employee: ");
            int salary = scanner.nextInt();
            System.out.print("Enter grade of the employee: ");
            String grade = scanner.next();
            double bonus = 0;

            if (grade.equals("A")) {
                bonus = salary * 0.2;
            } else if (grade.equals("B")) {
                bonus = salary * 0.15;
            } else if (grade.equals("C")) {
                bonus = salary * 0.1;
            } else {
                System.out.println("Invalid grade entered!");
            }

            System.out.println("Bonus: " + bonus);
        } catch (Exception e) {
            System.out.println("Enter only numbers");
        }
    }
}
