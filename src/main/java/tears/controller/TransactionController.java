package tears.controller;

import tears.service.TransactionService;
import tears.service.impl.TransactionServiceImpl;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class TransactionController {

    public static void main(String[] args) {

        TransactionService transactionService = new TransactionServiceImpl();
        transactionService.getTransactions();
    }
}
