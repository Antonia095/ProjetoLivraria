package br.com.livraria.controle;

import br.com.livraria.modelo.Cadastro;
import java.io.IOException;
import java.util.Set;

public interface CadastroDao {
    Set<Cadastro> getCadastro() throws IOException, ClassNotFoundException;
        boolean salvar(Cadastro usuario) throws IOException, ClassNotFoundException;
        Cadastro acessar(String login, String senha) throws IOException, ClassNotFoundException;
        Cadastro buscar(String login)throws IOException, ClassNotFoundException;
}
