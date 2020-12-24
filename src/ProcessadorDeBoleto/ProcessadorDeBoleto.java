package ProcessadorDeBoleto;

import java.util.*;

public class ProcessadorDeBoleto {
    public boolean pagamentoFatura(Fatura fat, List<Boleto> boletos) {

        double valTotalBoleto = 0;

        for(Boleto bol : boletos){
            valTotalBoleto += bol.getValor();
        }

        if (valTotalBoleto >= fat.getValorTotal()){
            return true;
        }
        else {
            return false;
        }
    }
}
