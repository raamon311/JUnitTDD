package ProcessadorDeBoleto;

import java.util.*;

public class Fatura {

    private int id;
    private double valorTotal;
    private String nome;
    private String status;

    public Fatura(int i, double vT, String n) {
        this.id = i;
        this.valorTotal = vT;
        this.nome = n;
        this.status = " ";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}