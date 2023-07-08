package advanchedLevel;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private String networkName;
    private static List<String> users = new ArrayList<>() {};

    public Network(String networkName) {
        this.networkName = networkName;
    }

    public static List<String> getUsers() {
        return users;
    }

    public static void setUsers(List<String> users) {
        Network.users = users;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public static boolean register(String phoneNumber) {
        if(!users.contains(phoneNumber)) {
            users.add(phoneNumber);
            System.out.println(phoneNumber + ": Registration completed");
            return true;
        } else {
            System.out.println("This number has already been added");
            return false;
        }
    }

    public static boolean checkRegistration(String phoneNumber) {
        if(users.contains(phoneNumber)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Network{" + "networkName='" + networkName + '\'' + '}';
    }
}
