package br.com.livraria.modelo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class CompraFornecedor {
    private int codCompra;
    private LocalDate data;
    private Livro[] livros;
    private int quantidade;

    public CompraFornecedor(int codCompra, LocalDate data, Livro[] livros, int quantidade) {
        this.codCompra = codCompra;
        this.data = data;
        this.livros = livros;
        this.quantidade = quantidade;
    }

    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
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
        hash = 71 * hash + this.codCompra;
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
        if (this.codCompra != other.codCompra) {
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
        return "CompraFornecedor{" + "codCompra=" + codCompra +
                ", data=" + data + ", livros=" + livros + 
                ", quantidade=" + quantidade + '}';
    }
    
    
}
