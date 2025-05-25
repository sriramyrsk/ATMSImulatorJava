import java.util.Scanner;

public class ATMSimulator {
    private Scanner scannerObj= new Scanner(System.in);
    private BankAccount bankAccount;
    private UserAuthentication userAuthentication;


    //injecting userAuthentication object
    public ATMSimulator(UserAuthentication userAuthentication){
        this.userAuthentication=userAuthentication;
    }

    /**
     *Method to login with maximum of 3 attempts
     * in case of successful login , a bank account is received
     * it uses userAuthentication to authenticate
     */
    public void login(){

        int tries=3;
        int userPin;
        long userAccountNumber;

        //ask input repeatedly for maximum of 3 times if bankAccount not received
        while(bankAccount == null && tries > 0 ){

            System.out.print("\nEnter the account number : ");
            userAccountNumber = scannerObj.nextLong();

            System.out.print("\nEnter the pin for your account : ");
            userPin=scannerObj.nextInt();

            //performs authentication
            bankAccount = userAuthentication.authenticate(userAccountNumber,userPin); //returns a bank account if successful.

            if(bankAccount != null){
                System.out.println("Successful Login!");
                showMenu(); //shows main menu
                break;
            }

            else {
                System.out.println("Wrong account number or pin , try again you have "+ (tries-1) + " Attempts");
            }

            tries--;

        }


    }
    private void showMenu(){
        int action;
        int amount;

        // as long as a bankAccount exist, gets user action and performs it
        while(bankAccount!=null){

            action=getInput(); //getting user action

            switch (action){
                case 1 :
                    System.out.println("-----------------------------------------");
                    System.out.println("Balance : "+ bankAccount.getBalance()+"");
                    System.out.println("-----------------------------------------");
                    break;

                case 2:
                    System.out.print("\nEnter the amount to withdraw : ");
                    amount= scannerObj.nextInt();
                    bankAccount.withdraw(amount);
                    break;

                case 3:
                    System.out.print("\nEnter the amount to deposit : ");
                    amount = scannerObj.nextInt();
                    bankAccount.deposit(amount);
                    break;

                case 4:
                    System.out.println("Exit sucessfull");
                    bankAccount=null; //ends the session
                    break;

                default:
                    System.out.println("Something Went wrong");
                    break;
            }
        }
    }

    /**
     *Method Gets the user action
     */

    private int getInput(){
        System.out.println("\nEnter the operation number to be performed.");
        System.out.println("1)Type 1 to Check Balance.");
        System.out.println("2)Type 2 to withdraw.");
        System.out.println("3)Type 3 to Deposit.");
        System.out.println("4)Type 4 to exit.");
        System.out.print("\nEnter your action number : ");
        int userInput = scannerObj.nextInt();

        return userInput;
    }


}
