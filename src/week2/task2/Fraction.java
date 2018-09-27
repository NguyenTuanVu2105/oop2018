package week2.task2;
import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.denominator    = denominator;
        this.numerator      = numerator;
    }

    public void reduce(){
        int gcd = Task1.gcd(numerator, denominator);
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }


    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        other.reduce();
        this.reduce();

        int denominatorResult   = this.denominator * other.denominator / Task1.gcd(this.denominator, other.denominator); //lcd(this.denominator, other.denominator)
        int numeratorResult     = this.numerator * (denominatorResult / this.denominator)
                                + other.numerator * (denominatorResult / other.denominator);

        return new Fraction(numeratorResult, denominatorResult);
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        other.reduce();
        this.reduce();

        int denominatorResult   = this.denominator * other.denominator / Task1.gcd(this.denominator, other.denominator); //lcd(this.denominator, other.denominator)
        int numeratorResult     = this.numerator * (denominatorResult / this.denominator)
                                - other.numerator * (denominatorResult / other.denominator);

        return new Fraction(numeratorResult, denominatorResult);
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        other.reduce();
        this.reduce();
        int gcd1    = Task1.gcd(this.numerator,other.denominator);
        int gcd2    = Task1.gcd(this.denominator,other.numerator);

        int numeratorResult     = (this.numerator  /  gcd1)
                                * (other.numerator /  gcd2);
        int denominatorResult   = (this.denominator  / gcd2)
                                * (other.denominator / gcd1);

        return new Fraction(numeratorResult, denominatorResult);
    }


    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        other.reduce();
        this.reduce();
        int gcd1    = Task1.gcd(this.numerator,other.numerator);
        int gcd2    = Task1.gcd(this.denominator,other.denominator);

        int numeratorResult     = (this.numerator  /  gcd1)
                                * (other.denominator /  gcd2);
        int denominatorResult   = (this.denominator  / gcd2)
                                * (other.numerator / gcd1);

        return new Fraction(numeratorResult, denominatorResult);
    }

    public boolean equals(Fraction other){
        this.reduce();
        other.reduce();
        return (this.numerator == other.numerator) && (this.denominator == other.denominator);
    }
    public void display(){
        System.out.println(numerator + "/" + denominator);
    }

}
