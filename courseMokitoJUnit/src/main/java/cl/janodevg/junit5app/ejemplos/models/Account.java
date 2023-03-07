package cl.janodevg.junit5app.ejemplos.models;

import java.math.BigDecimal;

public class Account {
    private String person;
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
