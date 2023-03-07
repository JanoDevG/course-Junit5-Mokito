package cl.janodevg.ejemplos.models;

import java.math.BigDecimal;

public class Account {
    private String person;

    public Account(String person, BigDecimal amount) {
        this.person = person;
        this.amount = amount;
    }

    public Account() {
    }

    private BigDecimal amount;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
