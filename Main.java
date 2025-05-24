public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123532523,1234);

        ATMSimulator atmObj = new ATMSimulator(account);

      atmObj.login();

    }
}
