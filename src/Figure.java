public abstract class Figure {
    private int numberOfSides;

    public Figure(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
