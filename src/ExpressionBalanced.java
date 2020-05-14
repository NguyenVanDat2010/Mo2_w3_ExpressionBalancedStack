import java.util.Stack;

public class ExpressionBalanced {
    public static void main(String[] args) {
        String str1 = "s * (s – a) * (s – b) * (s – c) ";
        String str2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a ";
        String str3 = "s * (s – a) * (s – b * (s – c)";
        String str4 = "s * (s – a) * s – b) * (s – c)";
        String str5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        if (isExpressionBalanced(str1)) {
            System.out.println("Well");
        } else {
            System.out.println("Bad");
        }
    }

    //Thuat toán đang sai
    public static boolean isExpressionBalanced(String input) {
        Stack<String> myStack = new Stack<>();
//        stack *s = new stack;
        for (int i = 0; i < input.length(); i++) {
            if (!input.equals(' ')) {
                if ((input.equals(')') || input.equals(']') || input.equals('}')) && myStack.isEmpty()) return false;
                else if (input.equals('(') || input.equals('[') || input.equals('{')) myStack.push(input);
                else if ((input.equals(')') && myStack.add("(")) ||
                        (input.equals(']') && myStack.add("[")) ||
                        (input.equals('}') && myStack.add("{"))) myStack.pop();
                else return false;
            }
        }
        return myStack.isEmpty();
    }
}
