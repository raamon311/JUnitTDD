package ProcessadorDeBoleto;

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

    private Fatura fat;
    private Boleto bol1;
    private Boleto bol2;
    private ProcessadorDeBoleto processaBoleto;
    private List<Boleto> boletos;

    @BeforeEach
    public void inicializaFaturaPagaTest() {

        fat = new Fatura(1, 700.0, "Ramon");

        bol1 = new Boleto(1, 500.00);
        bol2 = new Boleto(2, 200.00);

        boletos = new ArrayList<Boleto>();

        boletos.add(bol1);
        boletos.add(bol2);

        processaBoleto = new ProcessadorDeBoleto();
    }

    @Test
    public void FaturaPagaTest() {

        boolean statusFatura = true;
        Assert.assertEquals(statusFatura, processaBoleto.pagamentoFatura(fat, boletos));

    }
}