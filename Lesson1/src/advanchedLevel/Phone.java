package advanchedLevel;

public class Phone {
    private String phoneNumber;
    private String networkName;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public void register(Network network) {
        this.networkName = network.getName();
    }

    public void call(Phone phone) {
        if(phone.getPhoneNumber() != null && this.phoneNumber != null && this.phoneNumber.length() > 10 && phone.getPhoneNumber().length() > 10) {
            if(this.networkName != null) {
                if(this.phoneNumber != phone.getPhoneNumber()) {
                    if(phone.getNetworkName() != null) {
                        System.out.println("call... call... call..");
                    } else {
                        System.out.println("The phone number of the person you are calling not registered.");
                    }
                } else {
                    System.out.println("You can't call yourself");
                }
            } else {
                System.out.println("Please, register your phone number");
            }
        } else {
            System.out.println("ERROR. Please input phone number");
        }
    }

    public void calls(Phone phone) {
        if(phone.getPhoneNumber() != null && phone.getPhoneNumber().length() > 10){
            System.out.printf("%s calls you\n", phone.getPhoneNumber());
        } else {
            System.out.println("ERROR");
        }
    }

    @Override
    public String toString() {
        return "Phone{" + "phoneNumber='" + phoneNumber + '\'' + ", networkName='" + networkName + '\'' + '}';
    }
}
