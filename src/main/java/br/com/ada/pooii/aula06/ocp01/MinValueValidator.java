package br.com.ada.pooii.aula06.ocp01;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MinValueValidator implements Validator{
    private static final BigDecimal MIN_DAILY_LIMIT = new BigDecimal("10");

    @Override
    public boolean isValid(Transaction transaction) {
        return transaction.getAmount().compareTo(MIN_DAILY_LIMIT) >= 0;
    }
}
