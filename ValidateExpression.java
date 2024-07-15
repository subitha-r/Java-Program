/*
 * Check whether a given mathematical expression is valid.

    Eg.) Input  : (a+b)(a*b)
         Output : Valid

         Input  : (ab)(ab+)
         Output : Invalid

         Input  : ((a+b)
         Output : Invalid 
 */

public class ValidateExpression {

    public static boolean isValidExpression(String expression) {
        // Check if parentheses are balanced
        if (!areParenthesesBalanced(expression)) {
            return false;
        }

        // Check for valid placement of operators
        if (!areOperatorsPlacedCorrectly(expression)) {
            return false;
        }

        return true;
    }

    private static boolean areParenthesesBalanced(String expression) {
        int balance = 0;

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                balance--;
                if (balance < 0) {
                    return false; // More closing parentheses than opening ones
                }
            }
        }

        return balance == 0; // Ensure all opening parentheses are closed
    }

    private static boolean areOperatorsPlacedCorrectly(String expression) {
        char[] validOperators = { '+', '-', '*', '/' };
        char prevChar = ' ';
        boolean lastWasOperator = false;

        for (char ch : expression.toCharArray()) {
            if (ch == ' ') {
                continue;
            }
            if (isOperator(ch)) {
                if (lastWasOperator || prevChar == '(' || prevChar == ' ') {
                    return false; // Invalid if two operators in a row or starts with an operator
                }
                lastWasOperator = true;
            } else if (ch == ')') {
                if (isOperator(prevChar)) {
                    return false; // Invalid if the expression ends with an operator before a closing parenthesis
                }
                lastWasOperator = false;
            } else {
                lastWasOperator = false;
            }
            prevChar = ch;
        }

        return !lastWasOperator; // Ensure the expression does not end with an operator
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static void main(String[] args) {
        String input1 = "(a+b)(a*b)";
        String input2 = "(ab)(ab+)";
        String input3 = "((a+b)";

        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + (isValidExpression(input1) ? "Valid" : "Invalid"));

        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + (isValidExpression(input2) ? "Valid" : "Invalid"));

        System.out.println("Input 3: " + input3);
        System.out.println("Output 3: " + (isValidExpression(input3) ? "Valid" : "Invalid"));
    }
}
