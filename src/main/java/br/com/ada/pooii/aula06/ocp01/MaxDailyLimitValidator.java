package br.com.ada.pooii.aula06.ocp01;

import java.math.BigDecimal;

public class MaxDailyLimitValidator implements Validator{
    private static final BigDecimal MAX_DAILY_LIMIT = new BigDecimal("1000");

    @Override
    public boolean isValid(Transaction transaction) {
            return transaction.getAmount().compareTo(MAX_DAILY_LIMIT) <= 0;
        }
}