public class Triangle extends Figure {
    private int width;
    private int height;

    public Triangle(int width, int height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return width * 3;
    }

    public double getPerimeterIso(int side1Size, int sidesSize) {
        return side1Size + (sidesSize * 2);
    }

    public double getPerimeterScalene(int side1Size, int side2Size, int side3Size) {
        return side1Size + side2Size + side3Size;
    }

}