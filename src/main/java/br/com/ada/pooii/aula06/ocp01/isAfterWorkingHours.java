package br.com.ada.pooii.aula06.ocp01;

import java.time.LocalDateTime;

public class isAfterWorkingHours implements Validator{
    @Override
    public boolean isValid(Transaction transaction) {
        LocalDateTime limit = LocalDateTime.of(2024,1,22,22,0,0);
        return transaction.getCreated().isBefore(limit);
    }
}