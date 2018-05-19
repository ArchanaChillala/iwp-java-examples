public class Wallet {
    private double balance;

    public Wallet(double amount) {
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public boolean validateAndCredit(double amount) {
        if(amount > 0) {
            credit(amount);
            return true;
        }
        else
            return false;
    }

    private void credit(double amount) {
        balance += amount;
    }

    public boolean validateAndDebit(double amount) {
        if(balance > amount) {
            debit(amount);
            return true;
        }
        else
            return false;
    }

    private void debit(double amount) {
        balance -= amount;
    }
}
