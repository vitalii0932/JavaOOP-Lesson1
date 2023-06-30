package advanchedLevel;

public class Main {
    public static void main(String[] args) {
        Network network1 = new Network("Vodafone", "095");
        Network network2 = new Network("KyivStar", "095");
        Network network3 = new Network("Lifecell", "095");

        Phone phone1 = new Phone("7763498", "Vania");
        Phone phone2 = new Phone("1765676", "Danila");

        phone1.call(phone2.getPhoneNumber());
        phone1.register(network1);
        phone1.call(phone1.getPhoneNumber());
        phone1.call(phone2.getPhoneNumber());
        phone2.register(network2);
        phone1.call(phone2.getPhoneNumber());
    }
}
