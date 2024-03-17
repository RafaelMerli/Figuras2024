public class Rectangle extends Figure implements Resize {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(4);
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

        return height * width;
    }

    @Override
    public double getPerimeter() {
        return height + height + width + width;
    }

    public void Resize(int index) {
        this.height = this.height * index;
        this.width = this.width * index;
    }

}
