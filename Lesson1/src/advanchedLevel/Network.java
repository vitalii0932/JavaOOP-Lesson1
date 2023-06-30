package advanchedLevel;

public class Network {
    private String name;
    private String ID;

    public Network(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public Network() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Network{" + "name='" + name + '\'' + ", ID='" + ID + '\'' + '}';
    }
}
