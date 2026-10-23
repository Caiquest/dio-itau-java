public non-sealed class Manager extends Employee{
    private String login;

    private String password;

    private double comission;

    public Manager(String code, String name, String address, int age, double salary) {
        super(code, name, address, age, salary);
    }

    public Manager() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }
}
