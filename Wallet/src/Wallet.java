public class Wallet {
    private double balance;

    public Wallet() {
        balance = 0;
    }

    double getBalance() {
        return balance;
    }

    boolean validateAndCredit(double amount) {
        if (amount > 0) {
            credit(amount);
            return true;
        }
        return false;
    }

    private void credit(double amount) {
        balance += amount;
    }

    boolean validateAndDebit(double amount) {
        if (balance > amount) {
            debit(amount);
            return true;
        }
        return false;
    }

    private void debit(double amount) {
        balance -= amount;
    }
}
