
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter program number (1-20): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: p1(); break;
            case 2: p2(); break;
            case 3: p3(); break;
            case 4: p4(); break;
            case 5: p5(); break;
            case 6: p6(); break;
            case 7: p7(); break;
            case 8: p8(); break;
            case 9: p9(); break;
            case 10: p10(); break;
            case 11: p11(); break;
            case 12: p12(); break;
            case 13: p13(); break;
            case 14: p14(); break;
            case 15: p15(); break;
            case 16: p16(); break;
            case 17: p17(); break;
            case 18: p18(); break;
            case 19: p19(); break;
            case 20: p20(); break;
            default: System.out.println("Invalid choice");
        }
    }

    // 1. Name, age and college
    static void p1() {
        String name = "Vansh";
        int age = 22;
        String college = "ABC College";

        System.out.println(name);
        System.out.println(age);
        System.out.println(college);
    }

    // 2. Arithmetic operations
    static void p2() {
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        if (b != 0) {
            System.out.println(a / b);
            System.out.println(a % b);
        }
    }

    // 3. Even or odd
    static void p3() {
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    // 4. Relational operators
    static void p4() {
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }

    // 5. Explicit type casting
    static void p5() {
        double n = sc.nextDouble();
        int x = (int) n;

        System.out.println(n);
        System.out.println(x);
    }

    // 6. ASCII value
    static void p6() {
        char ch = sc.next().charAt(0);
        System.out.println((int) ch);
    }

    // 7. Divisible by 3 and 5
    static void p7() {
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0)
            System.out.println("Divisible");
        else
            System.out.println("Not divisible");
    }

    // 8. Vowel or consonant
    static void p8() {
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0)
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            System.out.println("Invalid character");
        }
    }

    // 9. Total, percentage and pass/fail
    static void p9() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a + b + c;
        double percentage = total / 3.0;

        System.out.println(total);
        System.out.println(percentage);

        if (a >= 40 && b >= 40 && c >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }

    // 10. Greatest of two numbers
    static void p10() {
        int a = sc.nextInt(), b = sc.nextInt();

        if (a > b)
            System.out.println(a);
        else if (b > a)
            System.out.println(b);
        else
            System.out.println("Equal");
    }

    // 11. Largest of three numbers
    static void p11() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b) {
            if (a >= c)
                System.out.println(a);
            else
                System.out.println(c);
        } else {
            if (b >= c)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }

    // 12. Leap year
    static void p12() {
        int year = sc.nextInt();

        if (year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }

    // 13. Positive, negative or zero
    static void p13() {
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

    // 14. Character classification
    static void p14() {
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if (Character.isUpperCase(ch))
            System.out.println("Uppercase letter");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase letter");
        else
            System.out.println("Special character");
    }

    // 15. Three-digit Armstrong number
    static void p15() {
        int n = sc.nextInt();

        if (n >= 100 && n <= 999) {
            int temp = n, sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == n)
                System.out.println("Armstrong number");
            else
                System.out.println("Not an Armstrong number");
        } else {
            System.out.println("Invalid number");
        }
    }

    // 16. Income tax
    static void p16() {
        double salary = sc.nextDouble();
        double tax;

        if (salary <= 250000)
            tax = 0;
        else if (salary <= 500000)
            tax = salary * 0.05;
        else if (salary <= 1000000)
            tax = salary * 0.20;
        else
            tax = salary * 0.30;

        System.out.println(tax);
    }

    // 17. Palindrome number
    static void p17() {
        int n = sc.nextInt();
        int original = n, reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        if (original >= 0 && original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }

    // 18. Prime number
    static void p18() {
        int n = sc.nextInt();
        boolean prime = n >= 2;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }

    // 19. Calculator using operators
    static void p19() {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);

        if (op == '+')
            System.out.println(a + b);
        else if (op == '-')
            System.out.println(a - b);
        else if (op == '*')
            System.out.println(a * b);
        else if (op == '/') {
            if (b != 0)
                System.out.println(a / b);
            else
                System.out.println("Division by zero not allowed");
        } else {
            System.out.println("Invalid operator");
        }
    }

    // 20. Marriage eligibility
    static void p20() {
        int age = sc.nextInt();
        char gender = Character.toLowerCase(
            sc.next().charAt(0));

        if (gender == 'm') {
            if (age >= 21)
                System.out.println("Eligible");
            else
                System.out.println("Not eligible");
        } else if (gender == 'f') {
            if (age >= 18)
                System.out.println("Eligible");
            else
                System.out.println("Not eligible");
        } else {
            System.out.println("Invalid gender");
        }
    }
}
