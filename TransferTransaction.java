public class TransferTransaction extends Transaction{
    private final String receiverAccountNumber;
    public TransferTransaction(String transactionId , double amount , String date , String receiverAccountNumber){
        super(transactionId,amount,date);
        this.receiverAccountNumber=receiverAccountNumber;
    }

    @Override
    public String generateNotification(){
        return "Transferred ₹" + getAmount() + " to account " + receiverAccountNumber + " on "
                + getDate()+ ". Transaction ID: " + getTransactionId() ;
    }
}
