package ProcessadorDeBoleto;

import java.util.*;

public class ProcessadorDeBoleto {

    public void criarBoleto(Boleto bol){
        int id = bol.getId();
        double valorPago = bol.getValor();
        String tipoPg = "BOLETO";
        Pagamento pg = new Pagamento(id, valorPago, tipoPg);

    }

    public void pagamentoFatura(Fatura fat, List<Boleto> boletos) {

        double valTotalBoleto = 0;

        for(Boleto bol : boletos){
            criarBoleto(bol);
            valTotalBoleto += bol.getValor();
        }

        if (valTotalBoleto >= fat.getValorTotal()){
            fat.setStatus("FATURA PAGA!");
        }
        else {
            fat.setStatus("FATURA PENDENTE DE PAGAMENTO!");
        }
    }
}
