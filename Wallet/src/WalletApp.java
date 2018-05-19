public class WalletApp {
    public static void main(String[] args) {
        WalletOwner archana = new WalletOwner(300);

        System.out.println(archana.knowBalance());

        archana.putMoney(-400);
        System.out.println(archana.knowBalance());

        archana.putMoney(200);
        System.out.println(archana.knowBalance());

        archana.purchaseItem(400);
        System.out.println(archana.knowBalance());

        archana.purchaseItem(1000);
        System.out.println(archana.knowBalance());

    }
}
