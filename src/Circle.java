public class Circle {
    private double PI;
    private double radius;

    public Circle(double PI, double radius) {
        this.PI = PI;
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return  PI * (radius * radius);
    }

    public double getCircumference(){
        return PI * 2 * radius;
    }
}
