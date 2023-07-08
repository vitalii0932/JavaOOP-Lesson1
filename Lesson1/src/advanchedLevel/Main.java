package advanchedLevel;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("0936548675", "Danil");
        Phone phone2 = new Phone("0936565345", "Anton");
        Network network = new Network("Vodafon");

        phone1.call("0936565345");
        phone1.register();
        phone1.call("0936565345");
        phone2.register();
        phone1.call("0936565345");
        System.out.println(phone1.toString());
    }
}
