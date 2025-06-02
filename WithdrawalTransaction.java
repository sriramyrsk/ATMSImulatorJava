public class WithdrawalTransaction extends Transaction{

    public WithdrawalTransaction(String transactionId, double amount , String date){
        super(transactionId,amount,date); //passing it parent constructor
    }

    @Override
    public String generateNotification(){
        return "Withdrawal of ₹" + getAmount() + " completed on " + getDate() + ". Transaction ID: " + getTransactionId();
    }
}
