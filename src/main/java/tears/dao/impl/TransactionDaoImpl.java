package tears.dao.impl;

import tears.dao.TransactionDao;
import tears.database.TransactionData;
import tears.model.Transaction;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class TransactionDaoImpl implements TransactionDao {
    @Override
    public Transaction getTransaction() {
        return TransactionData.getTransaction();
    }

    @Override
    public Transaction[] getTransactions() {
        return TransactionData.getTransactions();
    }

    @Override
    public Transaction getByID(Long id) {
        final Transaction transaction = new Transaction();
        transaction.setAccount("MyAccount");
        transaction.setStatus("declined");
        return transaction;
    }
}
