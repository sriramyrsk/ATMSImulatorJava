import java.util.ArrayList;

public class TransactionApp {
    public static void main(String[] args) {
        ArrayList<Transaction> transactionList = new ArrayList<>(); //list of type super class

        //subclass object creation
        DepositTransaction depositTransaction = new DepositTransaction("Trans0001",5000,"24-05-2025");
        WithdrawalTransaction withdrawalTransaction = new WithdrawalTransaction("Trans0002" , 6000,"26-05-2025");
        TransferTransaction transferTransaction =  new TransferTransaction("Trans0003",7000,"29-05-2025","EAC1124546");

        //adding them into Transaction List
        transactionList.add(depositTransaction);
        transactionList.add(withdrawalTransaction);
        transactionList.add(transferTransaction);


        //printing them
        for(Transaction transaction : transactionList){
            System.out.println(transaction.generateNotification());

        }
    }
}