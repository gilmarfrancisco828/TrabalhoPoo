package Controlador;

import java.io.Serializable;

public class Cliente implements Serializable {

    private static final long serialVersionUID = 888L;
    String cpf;
    String nome;

    public Cliente() {
    }

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void relatorio() {
        System.out.println(this.getNome() + "\t\t\t  " + this.getCpf());
    }

    public String relatorioDetalhado() {
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf();
    }

    public static Cliente buscarCpf(Cliente[] clientes, String cpf) {
        for (Cliente cliente : clientes) {
            if (cpf.equals(cliente.getCpf())) {
                return cliente;
            }
        }
        return null;
    }

    public static Cliente buscarNome(Cliente[] clientes, String nome) {
        for (Cliente cliente : clientes) {
            if (nome.equals(cliente.getNome())) {
                return cliente;
            }
        }
        return null;
    }
}
