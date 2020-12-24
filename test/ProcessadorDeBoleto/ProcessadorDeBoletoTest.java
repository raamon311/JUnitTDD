package processadorDeBoleto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ProcessadorDeBoletoTest {


    @Test
    public void FaturaPagaTest() {

        Fatura fat = new Fatura(1, 1000, "Ramon");
        boolean statusFatura = true;

        Boleto bol1 = new Boleto(1, 500);
        Boleto bol2 = new Boleto(2, 200);

        List<Boleto> boletos = new ArrayList<Boleto>();

        boletos.add(bol1);
        boletos.add(bol2);

        Assert.assertEquals(statusFatura, pgFatura(fat, boletos));

    }

}