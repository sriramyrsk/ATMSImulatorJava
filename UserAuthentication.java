import java.util.ArrayList;

/**
 * The class contains list of bank accounts
 * performs authentication.
 * */
public class UserAuthentication {
    private ArrayList<BankAccount> accountsList;
    public UserAuthentication(ArrayList<BankAccount> accountsList){
        this.accountsList=accountsList;
    }

    /**
     * The method compare the given account data(accountNumber , pin) with our existing list of bank accounts.
     * @param accountNumber account number to verify
     * @param pin pin to verify
     * if authentication is successful , then it returns that account. else it will return null.
     * */
    public BankAccount authenticate(long accountNumber , long pin){

        for(BankAccount account : accountsList){

            //check to find a matching accountNumber from accountsList
            if(accountNumber == account.getAccountNumber()){
                //if found then , verify pin
                if(pin == account.getPin()){
                    return account; //returns the account when both account number and pin matches.
                }
            }

        }
        //when account number or pin does not match
        return null;
    }

}
