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
    private Fatura fat2;
    private Boleto bol1;
    private Boleto bol2;
    private ProcessadorDeBoleto processaBoleto;
    private List<Boleto> boletos;

    @BeforeEach
    public void inicializaFaturaPagaTest() {

        fat = new Fatura(1, 700.0, "Ramon");
        fat2 = new Fatura(2, 500.0, "Lucas");

        bol1 = new Boleto(1, 500.00);
        bol2 = new Boleto(2, 200.00);

        boletos = new ArrayList<Boleto>();

        boletos.add(bol1);
        boletos.add(bol2);

        processaBoleto = new ProcessadorDeBoleto();
    }

    @Test
    public void FaturaPagaTest() {

        String statusFatura = "PAGA";
        processaBoleto.pagamentoFatura(fat, boletos);
        Assert.assertEquals(statusFatura, fat.getStatus());

    }
    @Test
    public void FaturaNaoPagaTest(){

        String statusExpected = "NAO PAGA";
        processaBoletoBol.pagamentoFatura(fat2, boletos);
        Assert.assertEquals(statusExpected, fat2.getStatus());


    }

}