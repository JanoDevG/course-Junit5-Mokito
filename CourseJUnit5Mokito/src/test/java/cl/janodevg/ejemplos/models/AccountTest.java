package cl.janodevg.ejemplos.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testAccountName(){
    Account account = new Account("ale", new BigDecimal("1000.123123"));
    String esperado = "ale";
    String real = account.getPerson();
        Assertions.assertEquals(esperado,real);
    }

}