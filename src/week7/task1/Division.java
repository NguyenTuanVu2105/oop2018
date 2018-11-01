package week7.task1;

public class Division extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        if (left instanceof Numeral && right instanceof Numeral) return left.toString() + "/" + right.toString();
        else return "(" + left.toString() + "/" + right.toString() + ")";
    }

    @Override
    public int evalute() {
        return left.evalute() / right.evalute();
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

}
