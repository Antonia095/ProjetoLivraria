package br.com.livraria.modelo;

import java.util.Arrays;

/**
 * 
 * @author JOCERLANIA
 */

public class ItemVenda {
    private int quantidade;
    private Livro[] livrosVendido;

    public ItemVenda(int quantidade, Livro[] livrosVendido) {
        this.quantidade = quantidade;
        this.livrosVendido = livrosVendido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Livro[] getLivrosVendido() {
        return livrosVendido;
    }

    public void setLivrosVendido(Livro[] livrosVendido) {
        this.livrosVendido = livrosVendido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.quantidade;
        hash = 29 * hash + Arrays.deepHashCode(this.livrosVendido);
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
        final ItemVenda other = (ItemVenda) obj;
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Arrays.deepEquals(this.livrosVendido, other.livrosVendido)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemVenda{" + "quantidade=" + quantidade + ", livrosVendido=" + livrosVendido + '}';
    }
    
    
}
