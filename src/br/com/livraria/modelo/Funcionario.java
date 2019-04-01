package br.com.livraria.modelo;

import java.io.Serializable;

public class Funcionario implements Serializable{
        private int cpf;
        private String nome;
        private int rg;
        private String rua;
        private String bairro;
        private String cidade;
        private int telefone;
        

    public Funcionario(int cpf, String nome, int rg, String rua, String bairro, String cidade, int telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
       
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    

    @Override
    public String toString() {
        return "Funcionario{" + "cpf=" + cpf + ", nome=" + nome + 
                ", rg=" + rg + ", rua=" + rua + ", bairro=" + bairro +
                ", cidade=" + cidade + ", telefone=" + telefone +  '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.cpf;
        hash = 47 * hash + this.rg;
        return hash;
    }

 }