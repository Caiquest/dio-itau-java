package domain;

public non-sealed class Salesman extends Employee {

    private double percentSold;

    public Salesman(String code,
                    String name,
                    String address,
                    int age,
                    double salary,
                    double percentSold) {
        super(code, name, address, age, salary);
        this.percentSold = percentSold;
    }

    @Override
    public String getCode() {
        return "SL" + this.code;
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
