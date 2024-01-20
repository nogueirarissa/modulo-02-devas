package br.com.ada.pooii.aula06.ocp01;

import java.math.BigDecimal;

public class TransactionSystem {

    private static final BigDecimal MAX_DAILY_LIMIT = new BigDecimal(1000);

    void executeTrade(Transaction transaction){

        if(transaction.getAmount().compareTo(MAX_DAILY_LIMIT) >= 0){
//          //impede a transação
            throw new RuntimeException("Invalid transaction: max limit");
        }

        if(isAfterWorkingHours(transaction){
            //impede a transação
            throw new RuntimeException("Invalid transaction: after working hours");
        }
        //logica para efetuar transação
    }

    private boolean
}
