package br.com.livraria.controle;

import br.com.livraria.modelo.Funcionario;
import java.io.IOException;
import java.util.Set;

public interface FuncionarioDao {
        Set<Funcionario> getFuncionario() throws IOException, ClassNotFoundException;
        boolean salvar(Funcionario funcionario) throws IOException, ClassNotFoundException;
        boolean deletar(Funcionario funcionario) throws IOException, ClassNotFoundException;
        Funcionario buscar(String cpf) throws IOException, ClassNotFoundException;
        boolean atualizar(Funcionario funcionario) throws IOException, ClassNotFoundException;
}
