package something;

public class Rectangle {
    //final
    //static
    public static double pi = 3.14;

    private String password;


    public double width;
    public double height;


    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double widthHeight) {
        this.width = widthHeight;
        this.height = widthHeight;
    }

    public double calculateArea() {


        return this.width * this.height + pi;
    }

    public double calculatePerimeter() {
        return 2 * this.width + 2 * this.height;
    }

    public boolean isSquare() {
        return this.width == this.height;
    }
}
