abstract class Account implements DepositAble {
    protected double balance;
    protected String name;

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " Account has " + this.balance + " Baht.";
    }

    public abstract void getInfoAcct();

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
