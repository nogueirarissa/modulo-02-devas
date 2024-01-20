package br.com.ada.pooii.aula06.ocp01;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private BigDecimal amount;

    private String stock;

    private LocalDateTime created;

    private BigDecimal getAmount(){
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
