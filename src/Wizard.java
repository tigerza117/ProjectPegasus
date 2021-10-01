public class Wizard extends Person {
    public Wizard(String name, CheckingAccount myAcct, Item myItem) {
        super(name, myAcct, myItem);
    }

    @Override
    public String getInfo() {
        return "[W] I'm a " + this.getName() + " Wizard (" + this.getMyAcct() + "). There is a/an " + this.getItem() + " in my bag.";
    }

    public void buyItem(Person m) {
        Merchant m2 = ((Merchant)m);
        System.out.println(m.getInfo());
        Item item = m2.sellItem(this);
        if (item != null) {
            this.setItem(item);
            System.out.println("[W] I got it.");
        } else {
            System.out.println("[W] Fail.");
        }
    }

    public boolean pay(Person m, double p) {
        if (this.getMyAcct().withdraw(p) && ((Merchant)m).collectMoney(this, p)) {
            System.out.println("[W] I have paid the item fees to "+ m.getName()+ ".");
            return true;
        }
        System.out.println("[W] I don’t have enough money.");
        return false;
    }
}
