import java.util.Stack;

public class Calculator {

    public static void main(String[] args) {
        String input = "4 5 + 1 2 * - 5 /";
        String[] elements = input.split(" ");
        Stack<String> data = new Stack<>();

        for (String element : elements) {
            try {
                double value = Double.parseDouble(element);
                data.push(element);
                System.out.println("push" + element + " " + value + " " + data);
            } catch (NumberFormatException nfe) {
                double pop1 = Double.parseDouble(data.pop());
                double pop2 = Double.parseDouble(data.pop());
                double result = switch (element) {
                    case "+" -> pop2 + pop1;
                    case "-" -> pop2 - pop1;
                    case "/" -> pop2 / pop1;
                    case "*" -> pop2 * pop1;
                    default -> 0;
                };
                data.push(String.valueOf(result));
                System.out.println("push" + result + " " + result + " " + data);
            }
        }
        System.out.println("Result: " + data.pop());
    }
}



