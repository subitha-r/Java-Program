/*
 * Remove unbalanced parentheses in a given expression.

    Eg.) Input  : ((abc)((de))
         Output : ((abc)(de))  

         Input  : (((ab)
         Output : (ab) 
 */
public class BalanceParentheses {

    public static String removeUnbalancedParentheses(String input) {
        // First pass: Remove extra closing parentheses
        int openCount = 0;
        int length = input.length();
        char[] tempArray = new char[length];
        int tempIndex = 0;

        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (ch == '(') {
                openCount++;
            } else if (ch == ')') {
                if (openCount == 0) {
                    continue; // skip this closing parenthesis
                }
                openCount--;
            }
            tempArray[tempIndex++] = ch;
        }

        // Second pass: Remove extra opening parentheses from the end
        int balance = 0;
        char[] resultArray = new char[tempIndex];
        int resultIndex = 0;

        for (int i = tempIndex - 1; i >= 0; i--) {
            char ch = tempArray[i];
            if (ch == ')') {
                balance++;
            } else if (ch == '(') {
                if (balance == 0) {
                    continue; // skip this opening parenthesis
                }
                balance--;
            }
            resultArray[resultIndex++] = ch;
        }

        // Reverse the result array to get the final string
        char[] finalArray = new char[resultIndex];
        for (int i = 0; i < resultIndex; i++) {
            finalArray[i] = resultArray[resultIndex - 1 - i];
        }

        return new String(finalArray);
    }

    public static void main(String[] args) {
        String input1 = "((abc)((de))";
        String input2 = "(((ab)";

        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + removeUnbalancedParentheses(input1));

        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + removeUnbalancedParentheses(input2));
    }
}
