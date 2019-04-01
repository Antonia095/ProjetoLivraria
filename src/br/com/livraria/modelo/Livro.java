package br.com.livraria.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Livro implements Serializable{
            private String cod_Barra;
            private String titulo;
            private String autor;
            private String genero;
            private int ano_Edicao;
            private float preco;

    public Livro(String cod_Barra, String titulo, String autor, String genero, int ano_Edicao, float preco) {
        this.cod_Barra = cod_Barra;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano_Edicao = ano_Edicao;
        this.preco = preco;
    }

    public String getCod_Barra() {
        return cod_Barra;
    }

    public void setCod_Barra(String cod_Barra) {
        this.cod_Barra = cod_Barra;
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

    public int getAno_Edicao() {
        return ano_Edicao;
    }

    public void setAno_Edicao(int ano_Edicao) {
        this.ano_Edicao = ano_Edicao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" + "cod_Barra=" + cod_Barra + 
                ", titulo=" + titulo + ", autor=" + autor + 
                ", genero=" + genero + ", ano_Edicao=" + ano_Edicao + 
                ", preco=" + preco + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.cod_Barra);
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
        if (!Objects.equals(this.cod_Barra, other.cod_Barra)) {
            return false;
        }
        return true;
    }

    
   
    
    
}
