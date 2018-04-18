abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}
class Triangle extends Shape{
    double a; double b; double c;
    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
}

class Rectangle extends Shape{
    double a; double b;
    Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    double getPerimeter() {
        return 2*(a + b);
    }

    @Override
    double getArea() {
        return a*b;
    }
}

class Circle extends Shape{
    double r;
    Circle(double r){
        this.r = r;
    }
    @Override
    double getPerimeter() {
        return Math.PI*2*r;
    }

    @Override
    double getArea() {
        return Math.PI*r*r;
    }
}