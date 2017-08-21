package tears.dao;

import tears.model.Transaction;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public interface TransactionDao {

    /**
     * @return Transaction.
     */
    Transaction getTransaction();

    /**
     * @return list of Transactions.
     */
    Transaction [] getTransactions();

    /**
     * @param id is transaction's id.
     * @return {@link Transaction} entity by given id.
     */
    Transaction getByID(Long id);
}
