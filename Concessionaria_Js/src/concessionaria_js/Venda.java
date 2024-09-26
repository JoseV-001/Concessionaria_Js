package concessionaria_js;

import java.util.Date;

public class Venda {
    private int id;
    private Date dataVenda;
    private String carroVendido;
    private String cliente;
    private String funcionarioVendas;
    private double valor;

    // Construtor
    public Venda(int id, Date dataVenda, String carroVendido, String cliente, String funcionarioVendas, double valor) {
        this.id = id;
        this.dataVenda = dataVenda;
        this.carroVendido = carroVendido;
        this.cliente = cliente;
        this.funcionarioVendas = funcionarioVendas;
        this.valor = valor;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getCarroVendido() {
        return carroVendido;
    }

    public void setCarroVendido(String carroVendido) {
        this.carroVendido = carroVendido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFuncionarioVendas() {
        return funcionarioVendas;
    }

    public void setFuncionarioVendas(String funcionarioVendas) {
        this.funcionarioVendas = funcionarioVendas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
