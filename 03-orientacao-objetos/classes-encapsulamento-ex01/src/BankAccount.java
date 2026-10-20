public class BankAccount {
    private final int accountNumber;

    private final double overDraft;

    private double balance;


    public BankAccount(int accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;

        if (initialDeposit <= 500) {
            overDraft = 50;
        } else {
            overDraft = initialDeposit * 0.5;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public boolean depositAccount(double value) {
        if (value > 0) {
            if(isUsingOverDraft()) {
                double fee = Math.abs(balance) * 0.2;
                balance -= fee;
            }
            balance += value;
            return true;
        } else {
            return false;
        }
    }

    public boolean payBill(double value){
        return withDraw(value);
    }

    public boolean withDraw(double value) {
        if (balance + overDraft >= value && value > 0) {
            balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean isUsingOverDraft() {
        return (balance < 0);
    }
}





