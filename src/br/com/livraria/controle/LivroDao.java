package br.com.livraria.controle;

import br.com.livraria.modelo.Livro;
import java.io.IOException;
import java.util.Set;

/**
 * Interface Dao da classe Livro
 * @author JOCERLANIA
 */

public interface LivroDao {
        Set<Livro> getLivro() throws IOException, ClassNotFoundException;
        boolean salvar(Livro livro) throws IOException, ClassNotFoundException;
        boolean deletar(Livro livro) throws IOException, ClassNotFoundException;
        Livro buscar(String codBarra) throws IOException, ClassNotFoundException;
        boolean atualizar(Livro livro) throws IOException, ClassNotFoundException;
}
