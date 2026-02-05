import java.util.Scanner;

class Calculator {

    // ✅ Methods for operations
    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double mul(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    static double mod(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== ✅ Continuous Calculator ===");
        System.out.println("Operations: +  -  *  /  %");
        System.out.println("Type 'x' to exit");

        // ✅ First time: take 2 numbers
        System.out.print("Enter first number: ");
        double result = sc.nextDouble();

        while (true) {

            System.out.print("\nChoose operation (+ - * / % ) or x to exit: ");
            char op = sc.next().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("✅ Final Result: " + result);
                System.out.println("Bye Rohit 😄");
                break;
            }

            // ✅ After first time: take only 1 number
            System.out.print("Enter next number: ");
            double num = sc.nextDouble();

            switch (op) {

                case '+':
                    result = add(result, num);
                    break;

                case '-':
                    result = sub(result, num);
                    break;

                case '*':
                    result = mul(result, num);
                    break;

                case '/':
                    if (num == 0) {
                        System.out.println("❌ Cannot divide by 0!");
                        continue;
                    }
                    result = div(result, num);
                    break;

                case '%':
                    if (num == 0) {
                        System.out.println("❌ Cannot modulo by 0!");
                        continue;
                    }
                    result = mod(result, num);
                    break;

                default:
                    System.out.println("❌ Invalid operation!");
                    continue;
            }

            System.out.println("✅ Result = " + result);
        }

    }
}
