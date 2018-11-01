package week7.task1;

public class Square extends Expression{
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        if (expression instanceof Numeral) return expression.toString() + "^2";
            else return "(" + expression.toString() + ")^2";
    }

    @Override
    public int evalute() {
        return expression.evalute() * expression.evalute();
    }
}
