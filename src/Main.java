import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle( 3.14, 180 );
        System.out.println( "Area " + circle.getArea() );
        System.out.println( "Circumference " + circle.getCircumference() );
    }
}