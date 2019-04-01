package br.com.livraria.modelo;

public class Gerente extends Funcionario {
        private float salario;

    public Gerente(float salario, int cpf, String nome, int rg, String rua, String bairro, String cidade, int telefone) {
        super(cpf, nome, rg, rua, bairro, cidade, telefone);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Gerente{" + "salario=" + salario + '}';
    }
        
     
}
