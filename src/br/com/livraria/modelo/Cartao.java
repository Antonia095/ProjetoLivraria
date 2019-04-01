package br.com.livraria.modelo;

public class Cartao {
        private int cpf_Cliente;
        private String titular;
        private int numero;
        private String bandeira;

    public Cartao(int cpf_Cliente, String titular, int numero, String bandeira) {
        this.cpf_Cliente = cpf_Cliente;
        this.titular = titular;
        this.numero = numero;
        this.bandeira = bandeira;
    }

    public int getCpf_Cliente() {
        return cpf_Cliente;
    }

    public void setCpf_Cliente(int cpf_Cliente) {
        this.cpf_Cliente = cpf_Cliente;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    @Override
    public String toString() {
        return "Cartao{" + "cpf_Cliente=" + cpf_Cliente + 
                ", titular=" + titular + ", numero=" + numero + 
                ", bandeira=" + bandeira + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.cpf_Cliente;
        hash = 67 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cartao other = (Cartao) obj;
        if (this.cpf_Cliente != other.cpf_Cliente) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
    
        
}
