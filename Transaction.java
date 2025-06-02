public abstract class Transaction {
    //Transaction cannot be altered, we can create a new transaction in case of failure.
    private final String transactionId;
    private final double amount;
    private final String date;

    public Transaction(String transactionId , double amount , String date){
        this.transactionId = transactionId;
        this.amount = amount;
        this.date = date;
    }

    //method to be overridden by subclass
    public abstract String generateNotification();

    //getters
    public String getTransactionId(){
        return transactionId;
    }

    public double getAmount(){
        return amount;
    }

    public String getDate(){
        return date;
    }


}

