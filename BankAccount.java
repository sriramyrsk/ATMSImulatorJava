public class BankAccount {

    //instance variables
    private final long accountNumber;
    private int pin;
    private float balance;

    //constructor for initializing values
 public BankAccount(long accountNumber, int pin){
        this.accountNumber=accountNumber;
        this.pin=pin;
        balance = 500.0f;
    }

    /**
     * Method for depositing amount into bank account.
     * @param depositAmount the amount to deposit given by the user.
     * */
    public void deposit(double depositAmount){
        //Allows only positive depositAmount
        if(depositAmount > 0 ){
            balance += depositAmount;
        }
        else{
            System.out.println("Invalid Deposit, Deposit Amount must be greater than 0");
        }

    }

    /**
     * Method for withdrawing amount from the bank account.
     * @param withdrawAmount the amount to be withdrawn given by the user.
     */
    public void  withdraw(double withdrawAmount){
        //Checks if sufficient funds available
        if(withdrawAmount <= balance && (balance-withdrawAmount > 500)){
            balance -= withdrawAmount;
        }
        else{
            System.out.println("Insufficient funds");
        }

    }

    //getters

    public double getBalance(){
        return balance;
    }

    public int getPin(){
        return pin;
    }

    public long getAccountNumber(){
        return accountNumber;
    }


    //setters
    public void setPin(int newPin){
        pin=newPin;
    }


}
