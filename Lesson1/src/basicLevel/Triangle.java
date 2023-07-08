package basicLevel;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getArea() {
        if(sideA > 0 && sideB > 0 && sideC > 0) {
            if(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA)
            {
                double p = sideA + sideB + sideC;
                return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            } else {
                System.out.println("Triangle don't exist.");
                return 0;
            }
        } else {
            System.out.println("One side = 0");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "triangle{" + "sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + '}';
    }
}
