package br.com.livraria.controle;

import br.com.livraria.modelo.Fornecedor;
import java.io.IOException;
import java.util.Set;

public interface FornecedorDao {
        Set<Fornecedor> getFornecedor() throws IOException, ClassNotFoundException;
        boolean salvar(Fornecedor fornecedor) throws IOException, ClassNotFoundException;
        boolean deletar(Fornecedor fornecedor) throws IOException, ClassNotFoundException;
        Fornecedor buscar(String nome) throws IOException, ClassNotFoundException;
        boolean atualizarDadosFornecedor(Fornecedor fornecedor) throws IOException, ClassNotFoundException;
}
