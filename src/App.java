public class App {
    public static void main(String[] args) throws Exception {
        var triangulo = new Triangle(10, 10);
        var rectangulo = new Rectangle(4, 20);
        System.out.println("antes de redimensionar: ");
        System.out.println("----------------------------------");
        System.out.println("ancho:" + rectangulo.getWidth() + ", altura: " + rectangulo.getHeight());
        rectangulo.Resize(3);
        System.out.println("----------------------------------");
        System.out.println("despues de redimensionar:");
        System.out.println("----------------------------------");
        System.out.println("ancho:" + rectangulo.getWidth() + ", altura: " + rectangulo.getHeight());
        System.out.println("----------------------------------");
        System.out.println("el area del triangulo es: " + triangulo.getArea());
    }
}
