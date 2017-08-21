package tears.service.impl;

import tears.dao.TransactionDao;
import tears.model.Transaction;
import tears.service.TransactionService;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class TransactionServiceImpl implements TransactionService {

    private TransactionDao transactionDao;

    /**
     * {@inheritDoc}.
     */
    @Override
    public Transaction getTransaction() {
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Transaction[] getTransactions() {
        return new Transaction[0];
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Transaction getByID(Long id) {
        return transactionDao.getByID(id);
    }
}
