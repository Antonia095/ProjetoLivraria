package br.com.livraria.modelo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * 
 * @author JOCERLANIA
 */

public class Venda {
      private String codVenda;
      private LocalDate dataVenda;
      private ItemVenda[] vendido;
      private Funcionario vendidoPor;

    public Venda(String codVenda, LocalDate dataVenda, ItemVenda[] vendido, Funcionario vendidoPor) {
        this.codVenda = codVenda;
        this.dataVenda = dataVenda;
        this.vendido = vendido;
    }

    public String getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(String codVenda) {
        this.codVenda = codVenda;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public ItemVenda[] getVendido() {
        return vendido;
    }

    public void setVendido(ItemVenda[] vendido) {
        this.vendido = vendido;
    }

    public Funcionario getVendidoPor() {
        return vendidoPor;
    }

    public void setVendidoPor(Funcionario vendidoPor) {
        this.vendidoPor = vendidoPor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.codVenda);
        hash = 59 * hash + Objects.hashCode(this.dataVenda);
        hash = 59 * hash + Arrays.deepHashCode(this.vendido);
        hash = 59 * hash + Objects.hashCode(this.vendidoPor);
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
        final Venda other = (Venda) obj;
        if (this.codVenda != other.codVenda) {
            return false;
        }
        if (!Objects.equals(this.dataVenda, other.dataVenda)) {
            return false;
        }
        if (!Arrays.deepEquals(this.vendido, other.vendido)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venda{" + "codVenda=" + codVenda + ", dataVenda=" + dataVenda + ", vendido=" + vendido + ", vendidoPor=" + vendidoPor + '}';
    }

    
      
      
}
