package advanchedLevel;

public class Phone {
    private String phoneNumber;
    private String userName;

    public Phone(String phoneNumber, String userName) {
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }

    public Phone() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void register() {
        if(this.phoneNumber.length() == 10 && this.phoneNumber != null) { // +38(063)***-**-**; 063 -> networkID
            boolean reg = Network.register(this.phoneNumber);
        }  else {
            System.out.println("Phone number error.");
        }
    }

    public void call(String callingPhoneNumber) {
        if(Network.checkRegistration(this.phoneNumber)) { //does user phone registered
            if(Network.checkRegistration(callingPhoneNumber)) { //does called phone registered
                if(this.phoneNumber != callingPhoneNumber) { //does user don't call himself
                    calls(this.phoneNumber);
                } else {
                    System.out.println("You can't call yourself");
                }
            } else {
                System.out.println("ERROR. Unknown network");
            }
        } else {
            System.out.println("Please, register your phone number");
        }
    }

    public void calls(String calledPhoneNumber) {
        System.out.printf("%s calls you: call... call... call..\n", calledPhoneNumber);
    }

    @Override
    public String toString() {
        return "Phone{" + "phoneNumber='" + phoneNumber + '\'' + ", UserName='" + userName + '\'' + '}';
    }
}
