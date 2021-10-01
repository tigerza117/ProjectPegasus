public class CheckingAccount extends Account implements WithdrawAble {
    private static double RATE = 0.1;

    public CheckingAccount() {
        super(0, null);
    }

    public CheckingAccount(double balance, String name) {
        super(balance, name);
    }

    public static void setRATE(double RATE) {
        CheckingAccount.RATE = RATE;
    }

    public static double getRATE() {
        return RATE;
    }

    public void showInterest() {
        System.out.println(RATE*this.balance);
    }

    public void showInterest(int year) {
        System.out.println(RATE*this.balance*year);
    }

    @Override
    public void getInfoAcct() {
        System.out.println(this.name+" Checking Account has "+this.balance+" Baht.");
    }

    @Override
    public boolean withdraw(double a) {
        if (a <= 0) {
            System.out.println("Not support zero or negative number.");
            return false;
        }
        if (this.balance-a >= 0) {
            this.balance -= a;
            System.out.println("[CA] Transaction success.");
            return true;
        }
        System.out.println("[CA] Transaction fail.");
        return false;
    }

    @Override
    public boolean deposit(double a) {
        if (a > 0) {
            this.balance += a;
            return true;
        }
        return false;
    }
}
