package Oct.ex_11102024_Encapsulation;

public class ICICIBank {
   //private data members
    private int name;
   private long balance;

   //Parametrized constructors for name and balance
    public ICICIBank(int name) {
        this.name = name;
    }

    public ICICIBank(long balance) {
        this.balance = balance;
    }

    //Getter and Setter for name
    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    //Getter and Setter for balance
    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
