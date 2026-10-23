public non-sealed class Salesman extends Employee {

    private double percentSold;

    public Salesman(String code, String name, String address, int age, double salary) {
        super(code, name, address, age, salary);
    }

    public Salesman() {
    }

    public double getPercentSold() {
        return percentSold;
    }

    public void setPercentSold(double percentSold) {
        this.percentSold = percentSold;
    }
}
