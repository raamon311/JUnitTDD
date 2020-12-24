package ProcessadorDeBoleto;

import java.util.*;

public class ProcessadorDeBoleto {

    public void criarBoleto(Boleto bol){
        int id = bol.getId();
        double valorPago = bol.getValor();
        String tipoPagamento = "BOLETO";
        Pagamento pg = new Pagamento(id, valorPago, tipoPagamento);

    }

    public void pagamentoFatura(Fatura fat, List<Boleto> boletos) {

        double valTotalBoleto = 0;

        for(Boleto bol : boletos){
            Pagamento(bol);
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
