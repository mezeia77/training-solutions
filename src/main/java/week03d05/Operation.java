package week03d05;

public class Operation {

    private int leftOperand;
    private int rightOperand;

    public Operation(String expression) {
        String left = expression.substring(0, expression.indexOf("+"));
        String right = expression.substring(expression.indexOf("+")+1);

        left = left.trim();
        right = right.trim();

        leftOperand = Integer.parseInt(left);
        rightOperand = Integer.parseInt(right);

    }

    public int getResult(){
        return leftOperand+rightOperand;
    }
}
