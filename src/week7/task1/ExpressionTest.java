package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        try {
            Expression n1 = new Numeral(10);
            Expression n2 = new Numeral(1);
            Expression n3 = new Numeral(2);
            Expression n4 = new Numeral(3);

            Expression exp1 = new Subtraction(new Square(n1), n2); //10^2 - 1
            Expression exp2 = new Multiplication(n3, n4); //2*3
            Expression expResult = new Square(new Addition(exp1, exp2)); //(10^2 - 1 + 2*3)^2

            System.out.println(expResult.toString() + " = " + expResult.evalute());

            Expression n5 = new Numeral(0);
            Expression test = new Division(n1,n5);
            System.out.println(test.toString() + " = ");
            System.out.println(test.evalute());
        } catch (ArithmeticException e){
            System.out.println("Lỗi chia cho 0");
        }
    }
}
