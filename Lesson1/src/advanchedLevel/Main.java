package advanchedLevel;

public class Main {
    public static void main(String[] args) {
        Network network1 = new Network("Vodafon");
        Network network2 = new Network("KyivStar");

        Phone phone1 = new Phone("+380957763498");
        Phone phone2 = new Phone("+380931765676");

        phone1.call(phone2);
        phone1.register(network1);
        phone1.call(phone1);
        phone1.call(phone2);
        phone2.register(network2);
        phone1.call(phone2);

        phone1.calls(phone2);
        Phone phone3 = new Phone();
        phone1.calls(phone3);
    }
}
