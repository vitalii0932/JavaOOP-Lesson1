package basicLevel;

public class Product {
    private int id;
    private String name;
    private int count;
    private int price;

    public Product(int id, String name, int count, int price) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void sellProduct(int id, int money)
    {
        if(this.id == id) {
            if(count > 0){
                if(money >= price) {
                    System.out.println(String.format("You bought %s. Your change is %d $", this.name, money - this.price));
                }
                else {
                    System.out.println("Not enough money!");
                }
            } else {
                System.out.println("This is item is a out of stock.");
            }
        } else {
            System.out.println("ERROR. Bad ID.");
        }
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", name='" + name + '\'' + ", count=" + count + ", price=" + price + '}';
    }
}
