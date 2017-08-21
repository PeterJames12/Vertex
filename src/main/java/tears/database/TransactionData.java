package tears.database;

import tears.model.Transaction;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class TransactionData {

    public static Transaction [] getTransactions(){
        final Transaction transaction = new Transaction();
        transaction.setAccount("MyAccount");
        transaction.setStatus("approved");

        Transaction [] transactions = new Transaction[1];
        transactions[0] = transaction;

        return transactions;
    }

    public static Transaction getTransaction(){
        final Transaction transaction = new Transaction();
        transaction.setAccount("MyAccount");
        transaction.setStatus("declined");

        return transaction;
    }
}
