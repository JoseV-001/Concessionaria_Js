package concessionaria_js;

import java.util.List;

public class Fornecedor {

    private int id;
    private String nome;
    private String endereco;
    private String estado;
    private String cep;
    private String telefone;
    private String cnpj;
    private String observacoes;
    private List<Fornecedor> fornecedores;

    public Fornecedor(int id, String nome, String endereco, String estado, String cep, String telefone, String cnpj, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.observacoes = observacoes;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    public void adicionarFornecedor(Fornecedor fornecedor) {
        this.fornecedores.add(fornecedor);
        System.out.println("Fornecedor adicionado: " + fornecedor.getNome());
    }

    public void removerFornecedor(Fornecedor fornecedor) {
        if (this.fornecedores.contains(fornecedor)) {
            this.fornecedores.remove(fornecedor);
            System.out.println("Fornecedor removido: " + fornecedor.getNome());
        } else {
            System.out.println("Fornecedor não está na lista.");
        }
    }

    public void exibirDetalhesFornecedor() {
        System.out.println("Detalhes do Fornecedor:");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + telefone);
        System.out.println("CNPJ: " + cnpj);
    }
}
