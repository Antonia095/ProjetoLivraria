package br.com.livraria.modelo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Venda {
      private int cod_Venda;
      private LocalDate data_Venda;
      private ItemVenda[] vendido;

    public Venda(int cod_Venda, LocalDate data_Venda, ItemVenda[] vendido) {
        this.cod_Venda = cod_Venda;
        this.data_Venda = data_Venda;
        this.vendido = vendido;
    }

    public int getCod_Venda() {
        return cod_Venda;
    }

    public void setCod_Venda(int cod_Venda) {
        this.cod_Venda = cod_Venda;
    }

    public LocalDate getData_Venda() {
        return data_Venda;
    }

    public void setData_Venda(LocalDate data_Venda) {
        this.data_Venda = data_Venda;
    }

    public ItemVenda[] getVendido() {
        return vendido;
    }

    public void setVendido(ItemVenda[] vendido) {
        this.vendido = vendido;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.cod_Venda;
        hash = 79 * hash + Objects.hashCode(this.data_Venda);
        hash = 79 * hash + Arrays.deepHashCode(this.vendido);
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
        if (this.cod_Venda != other.cod_Venda) {
            return false;
        }
        if (!Objects.equals(this.data_Venda, other.data_Venda)) {
            return false;
        }
        if (!Arrays.deepEquals(this.vendido, other.vendido)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venda{" + "cod_Venda=" + cod_Venda + ", data_Venda=" + data_Venda + ", vendido=" + vendido + '}';
    }
      
      
}
