package advanchedLevel;

public class Network {
    private String name;

    public Network(String name) {
        this.name = name;
    }

    public Network() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Network{" + "name='" + name + '\'' + '}';
    }
}
