package tears.service;

import tears.model.Transaction;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public interface TransactionService {

    /**
     * @return Transaction.
     */
    Transaction getTransaction();

    /**
     * @return list of Transactions.
     */
    Transaction [] getTransactions();

    /**
     * @param id is user's id.
     * @return {@link Transaction} entity by given id.
     */
    Transaction getByID(Long id);
}
