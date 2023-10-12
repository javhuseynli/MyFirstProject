import java.util.*;

class Main {
    public static String calc(String input) {
        String[] tokens = input.split("\\s+");

        if (tokens.length != 3) {
            return "throws Exception";
        }

        int a, b;
        try {
            a = Integer.parseInt(tokens[0]);
            b = Integer.parseInt(tokens[2]);
        } catch (NumberFormatException e) {
            return "throws Exception";
        }

        char operator = tokens[1].charAt(0);
        int result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    return "throws Exception";
                }
                result = a / b;
                break;
            default:
                return "throws Exception";
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = calc(input);
        System.out.println(output);
    }
}
