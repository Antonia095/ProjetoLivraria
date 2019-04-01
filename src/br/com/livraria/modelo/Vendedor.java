package br.com.livraria.modelo;

public class Vendedor extends Funcionario{
    private float salario;
    private float comissao_Venda;

    public Vendedor(float salario, float comissao_Venda, int cpf, String nome, int rg, String rua, String bairro, String cidade, int telefone) {
        super(cpf, nome, rg, rua, bairro, cidade, telefone);
        this.salario = salario;
        this.comissao_Venda = comissao_Venda;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComissao_Venda() {
        return comissao_Venda;
    }

    public void setComissao_Venda(float comissao_Venda) {
        this.comissao_Venda = comissao_Venda;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "salario=" + salario + ", comissao_Venda=" + comissao_Venda + '}';
    }
    
    
}
