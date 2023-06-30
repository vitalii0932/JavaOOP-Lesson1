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

    public void register(Network network) {
        if(this.phoneNumber.length() == 7) { // +38(063)***-**-**; 063 -> networkID
            this.phoneNumber = network.getID() + this.phoneNumber;
            System.out.printf("Registration completed. %s, your phone number is %s\n", this.userName, this.phoneNumber);
        }

        else
            System.out.println("Registration error.");
    }

    public void call(String callingPhoneNumber) {
        if(this.phoneNumber != null && this.phoneNumber.length() == 10) { //does user phone exist
            if(callingPhoneNumber != null && callingPhoneNumber.length() == 10) { //does called phone exist
                if(this.phoneNumber.substring(0,3).equals("093") || this.phoneNumber.substring(0,3).equals("095") || this.phoneNumber.substring(0,3).equals("097")) {
                    //does user phone registered
                    if(this.phoneNumber != callingPhoneNumber) { //does user don't call himself
                        if(callingPhoneNumber.substring(0,3).equals("093") || callingPhoneNumber.substring(0,3).equals("095") || callingPhoneNumber.substring(0,3).equals("097")) { //does called phone registered
                            calls(callingPhoneNumber);
                        } else {
                            System.out.println("ERROR. Unknown network.");
                        }
                    } else {
                        System.out.println("You can't call yourself");
                    }
                } else {
                    System.out.println("Unknown network. Please, register your phone number");
                }
            } else {
                System.out.println("The phone number you are calling is not correct");
            }
        } else {
            System.out.println("Please, register your phone number, or input another phone number");
        }
    }

    public void calls(String calledPhoneNumber) {
        System.out.printf("%s calling: call... call... call..\n", calledPhoneNumber);
    }

    @Override
    public String toString() {
        return "Phone{" + "phoneNumber='" + phoneNumber + '\'' + ", UserName='" + userName + '\'' + '}';
    }
}
