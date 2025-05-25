import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<BankAccount> accountsList = new ArrayList<BankAccount>(); //list of bankAccounts

        UserAuthentication userAuthenticationObj = new UserAuthentication(accountsList);

        BankAccount account = new BankAccount(1233,1234);
        accountsList.add(account);

        ATMSimulator atmObj = new ATMSimulator(userAuthenticationObj); //injecting userAuthentication


        atmObj.login();

    }
}
