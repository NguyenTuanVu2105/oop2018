package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.denominator    = denominator;
        this.numerator      = numerator;
    }



    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới

        int denominatorResult   = this.denominator * other.denominator;
        int numeratorResult     = this.numerator *  other.denominator + other.numerator * this.denominator;

        return new Fraction(numeratorResult, denominatorResult);
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int denominatorResult   = this.denominator * other.denominator;
        int numeratorResult     = this.numerator *  other.denominator - other.numerator * this.denominator;

        return new Fraction(numeratorResult, denominatorResult);
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int numeratorResult     = this.numerator * other.numerator;
        int denominatorResult   = this.denominator * other.denominator;

        return new Fraction(numeratorResult, denominatorResult);
    }


    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int numeratorResult     = this.numerator * other.denominator;
        int denominatorResult   = this.denominator * other.numerator;

        return new Fraction(numeratorResult, denominatorResult);
    }


    public boolean equals(Object obj){
        return (this.denominator == ((Fraction)obj).denominator) && (this.numerator == ((Fraction)obj).numerator);
    }
}
