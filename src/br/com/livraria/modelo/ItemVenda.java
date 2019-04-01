package br.com.livraria.modelo;

import java.util.Arrays;

public class ItemVenda {
    private int quantidade;
    private Livro[] livros_Vendido;

    public ItemVenda(int quantidade, Livro[] livros_Vendido) {
        this.quantidade = quantidade;
        this.livros_Vendido = livros_Vendido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Livro[] getLivros_Vendido() {
        return livros_Vendido;
    }

    public void setLivros_Vendido(Livro[] livros_Vendido) {
        this.livros_Vendido = livros_Vendido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.quantidade;
        hash = 29 * hash + Arrays.deepHashCode(this.livros_Vendido);
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
        if (!Arrays.deepEquals(this.livros_Vendido, other.livros_Vendido)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemVenda{" + "quantidade=" + quantidade + ", livros_Vendido=" + livros_Vendido + '}';
    }
    
    
}
