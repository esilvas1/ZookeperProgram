import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long number1 = scanner.nextLong();
        String operator = scanner.next();
        long number2 = scanner.nextLong();

        switch (operator) {
            case "+": long add = number1 + number2;
                System.out.printf("%d" , add); break;
            case "-": long less = number1 - number2;
                System.out.printf("%d", less); break;
            case "/": if (number2 == 0) {
                System.out.println("Division by 0!");
            } else {
                long div = number1 / number2;
                System.out.printf("%d", div);
            } break;
            case "*": long multi = number1 * number2;
                System.out.printf("%d", multi); break;
            default: System.out.println("Unknown operator");
        }
    }
}