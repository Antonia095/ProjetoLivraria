package br.com.livraria.modelo;

/**
 * 
 * @author JOCERLANIA
 */

public class Cartao {
        private int cpfCliente;
        private String titular;
        private int numero;
        private String bandeira;

    public Cartao(int cpfCliente, String titular, int numero, String bandeira) {
        this.cpfCliente = cpfCliente;
        this.titular = titular;
        this.numero = numero;
        this.bandeira = bandeira;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
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
        return "Cartao{" + "cpfCliente=" + cpfCliente + 
                ", titular=" + titular + ", numero=" + numero + 
                ", bandeira=" + bandeira + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.cpfCliente;
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
        if (this.cpfCliente != other.cpfCliente) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
    
        
}
