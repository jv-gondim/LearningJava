package exercicio007;

public class Interface {
    public static void main(String[] args) throws Exception {
        BankAccount firstAccount = new BankAccount();

        firstAccount.setAccountNumber(1234);
        firstAccount.setAccountOwner("Matheus");
        firstAccount.openAccount("CC");
        firstAccount.deposit(150);
        firstAccount.showState();
    }
}
