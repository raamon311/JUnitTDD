package ProcessadorDeBoleto;

import java.util.*;

public class Boleto {

    private int id;
    private double valor;

    public Boleto(int i, double val) {
        this.id = i;
        this.valor = val;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}