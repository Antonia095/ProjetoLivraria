package br.com.livraria.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Livro implements Serializable{

    
            private String codBarra;
            private String titulo;
            private String autor;
            private String genero;
            private int anoEdicao;
            private float preco;

    public Livro(String codBarra, String titulo, String autor, String genero, int anoEdicao, float preco) {
        this.codBarra = codBarra;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoEdicao = anoEdicao;
        this.preco = preco;
    }

    
    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" + "codBarra=" + codBarra + 
                ", titulo=" + titulo + ", autor=" + autor + 
                ", genero=" + genero + ", anoEdicao=" + anoEdicao + 
                ", preco=" + preco + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.codBarra);
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
        final Livro other = (Livro) obj;
        if (!Objects.equals(this.codBarra, other.codBarra)) {
            return false;
        }
        return true;
    }

    
   
    
    
}
