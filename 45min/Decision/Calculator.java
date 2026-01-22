class Calculator{
    public static void main(String[] args) {
        int a=34;
        int b=23;
        char c='-';
        switch (c) {
          case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}