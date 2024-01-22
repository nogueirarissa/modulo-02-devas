package br.com.ada.pooii.aula06.ocp01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class TransactionManager {

    private List<Validator> validators;

    public TransactionManager(){
        validators = new ArrayList<>();
        validators.add(new MaxDailyLimitValidator());
        validators.add(new MinValueValidator());
        validators.add(new StockForTradeAvailability());
        validators.add(new isAfterWorkingHours());
    }

    void executeTrade(Transaction transaction){
        for (Validator validator : validators){
            if (!validator.isValid(transaction)){
                throw new RuntimeException("Invalid transaction: " + validator.getClass().getSimpleName());
            }
        }
        transact(transaction);
    }

    private void transact(Transaction transaction) {
        System.out.println("Transaction succeed: " + transaction);
    }

}