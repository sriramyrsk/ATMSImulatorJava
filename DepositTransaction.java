public class DepositTransaction extends Transaction{

    public DepositTransaction(String transactionId , double amount , String date){
        super(transactionId,amount,date); //passing it to parent constructor
    }

    @Override
    public String generateNotification(){
        return "Deposit of ₹"+getAmount()+" completed on "+getDate()+". Transaction ID: "+getTransactionId();
    }
}
