package br.com.livraria.modelo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class CompraFornecedor {
    private int cod_Compra;
    private LocalDate data;
    private Livro[] livros;
    private int quantidade;

    public CompraFornecedor(int cod_Compra, LocalDate data, Livro[] livros, int quantidade) {
        this.cod_Compra = cod_Compra;
        this.data = data;
        this.livros = livros;
        this.quantidade = quantidade;
    }

    public int getCod_Compra() {
        return cod_Compra;
    }

    public void setCod_Compra(int cod_Compra) {
        this.cod_Compra = cod_Compra;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.cod_Compra;
        hash = 71 * hash + Objects.hashCode(this.data);
        hash = 71 * hash + Arrays.deepHashCode(this.livros);
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
        final CompraFornecedor other = (CompraFornecedor) obj;
        if (this.cod_Compra != other.cod_Compra) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Arrays.deepEquals(this.livros, other.livros)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CompraFornecedor{" + "cod_Compra=" + cod_Compra +
                ", data=" + data + ", livros=" + livros + 
                ", quantidade=" + quantidade + '}';
    }
    
    
}
