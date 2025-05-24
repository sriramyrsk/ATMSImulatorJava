import java.util.Scanner;

public class ATMSimulator {
    private Scanner scannerObj= new Scanner(System.in);
    private BankAccount bankAccount;
    private boolean status=false;

    //injecting bankAccount object
    public ATMSimulator(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }

    /**
     *Method for validating the pin with maximum of 3 attempts
     * incase of successfull login , the method also calls mainMenu
     */
    public void login(){

        int tries=3;
        int userPin;

        //ask input repeatedly for maximum of 3 times if pin not matched
        while(!status && tries > 0 ){

            System.out.println("Enter the pin for your account : ");
            userPin=scannerObj.nextInt();


            if(userPin == bankAccount.getPin()){
                status=true;
                System.out.println("Successfull Login!");
                mainMenu(); //shows main menu
                break;
            }
            else {
                System.out.println("Wrong pin entered , try again you have "+ (tries-1) + " Attempts");
            }

            tries--;
        }


    }
    private void mainMenu(){
        int action;
        int amount;

        // as long as session not over gets user action and performs it
        while(status){

            action=getInput(); //getting user action

            switch (action){
                case 1 :
                    System.out.println("Balance:  "+ bankAccount.getBalance());
                    break;

                case 2:
                    System.out.println("Enter the amount to withdraw : ");
                    amount= scannerObj.nextInt();
                    bankAccount.withdraw(amount);
                    break;

                case 3:
                    System.out.println("Enter the amount to deposit : ");
                    amount = scannerObj.nextInt();
                    bankAccount.deposit(amount);
                    break;

                case 4:
                    System.out.println("Exit sucessfull");
                    status=false; //ends the session
                    break;

                default:
                    System.out.println("Something Went wrong");
                    break;
            }
        }
    }

    /**
     *Method Gets the user Response
     */

    private int getInput(){
        System.out.println("\n Enter the operation number to be performed.");
        System.out.println("1)Type 1 to Check Balance.");
        System.out.println("2)Type 2 to withdraw.");
        System.out.println("3)Type 3 to Deposit.");
        System.out.println("4)Type 4 to exit.");

        int userInput = scannerObj.nextInt();

        return userInput;
    }


}
