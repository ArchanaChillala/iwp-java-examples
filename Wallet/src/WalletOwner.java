public class WalletOwner {
    private Wallet wallet;

    WalletOwner(double amount) {
        if(amount > 0)
            wallet = new Wallet(amount);
        else
            System.out.println("Invalid Amount");
    }

    public void putMoney(double money) {
        if(!wallet.validateAndCredit(money))
            System.out.println("Adding to wallet not possible");
        else
            System.out.println("Added successfully");
    }

    public void purchaseItem(double itemPrice) {
        if(!wallet.validateAndDebit(itemPrice))
            System.out.println("Can't purchase item");
        else
            System.out.println("Purchase successful");
    }

    public double knowBalance() {
        return wallet.getBalance();
    }
}
