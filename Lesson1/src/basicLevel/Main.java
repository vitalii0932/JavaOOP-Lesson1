package basicLevel;

public class Main {
    public static void main(String[] args) {
        Product product0 = new Product(0, "Monitor Samsung", 20, 2000);
        Product product1 = new Product(1, "SSD Crucial BX500", 300, 500);
        Product product2 = new Product(2, "Intel i3 9100f", 0, 500);
        Product product3 = new Product(3, "HHD Toshiba 1Tb", 5, 300);

        product0.sellProduct(1, 3000);
        System.out.println(product0.toString());
        product1.sellProduct(1, 450);
        System.out.println(product1.toString());
        product2.sellProduct(2, 700);
        System.out.println(product2.toString());
        product3.sellProduct(3, 500);
        System.out.println(product3.toString());

        System.out.println("--------------------------------------------");

        Triangle triangle1 = new Triangle(0.4, 0.5, 0.6);
        Triangle triangle2 = new Triangle(2, 0.3, 0.2);
        Triangle triangle3 = new Triangle(1, 0, 2);

        System.out.println("Area of your triangle is " + triangle1.getArea());
        System.out.println(triangle1.toString());
        System.out.println("Area of your triangle is " + triangle2.getArea());
        System.out.println(triangle2.toString());
        System.out.println("Area of your triangle is " + triangle3.getArea());
        System.out.println(triangle3.toString());
    }
}