package matching_brackets;

public class ExpressionValidator {
    public boolean hasMatchingBrackets(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int index = 0; index < expression.length(); index++) {
            char currentChar = expression.charAt(index);
            if (currentChar == '(' || currentChar == '[') {
                stack.push(currentChar);
            } else if (currentChar == ')' || currentChar == ']') {
                if (stack.isEmpty()) {
                    // closing a bracket that has not been opened
                    return false;
                }

                // we've closed the last bracket on the stack, so we can forget about it
                char poppedCharacter = stack.pop();
                if (currentChar == ')' && poppedCharacter != '(') {
                    return false;
                }
                if (currentChar == ']' && poppedCharacter != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
