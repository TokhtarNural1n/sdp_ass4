package Task1;

public class Main {
    public static void main(String[] args) {
        String expression = "5 + 2 - 3";
        int result = Interpreter.interpret(expression);
        System.out.println(expression + " = " + result);
    }
}