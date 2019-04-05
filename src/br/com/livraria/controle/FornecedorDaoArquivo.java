package br.com.livraria.controle;

import br.com.livraria.modelo.Fornecedor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe de implementação de Fornecedor dao
 * 
 * @author JOCERLANIA
 */

public class FornecedorDaoArquivo implements FornecedorDao{
        private File arquivoFornecedor;
 
        /**
         * Método de pesistência.
         * 
         * @throws IOException 
         */


    public FornecedorDaoArquivo() throws IOException {
        arquivoFornecedor = new File("Fornecedor.bin");
        
        if(!arquivoFornecedor.exists()){
            arquivoFornecedor.createNewFile();
        }
    }
    
    /**
     * Método usado para armazenar as informações da classe
     * fornecedor usando a tabela Hast.
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    
    @Override
    public Set<Fornecedor> getFornecedor() throws IOException, ClassNotFoundException {
        Set<Fornecedor> fornecedor;
       if(arquivoFornecedor.length()>0){
           ObjectInputStream f = new ObjectInputStream( new FileInputStream(arquivoFornecedor));
           fornecedor = (Set<Fornecedor>) f.readObject();
           f.close();
        }else{
         fornecedor = new HashSet<>();
       }
       return fornecedor;
    }

    /**
     * Método utilizado para salvar as informações do Fornecedor.
     * 
     * @param f
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    
    @Override
    public boolean salvar(Fornecedor f) throws IOException, ClassNotFoundException {
        Set<Fornecedor> fornecedor = getFornecedor();
        fornecedor.add(f);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoFornecedor));
        out.writeObject(fornecedor);
        out.close();
        return true;
    }
    
    /**
     * Método utilizado para deletar os dados do Fornecedor.
     * 
     * @param f
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */

    @Override
    public boolean deletar(Fornecedor f) throws IOException, ClassNotFoundException {
        Set<Fornecedor> fornecedor = getFornecedor();
        fornecedor.remove(f);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoFornecedor));
        out.writeObject(fornecedor);
        out.close();
        return true;
    }

    /**
     * Método utilizado para buscar os dados do Fornecedor cadastrado.
     * 
     * @param nome
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    
    @Override
    public Fornecedor buscar(String nome) throws IOException, ClassNotFoundException {
        Set<Fornecedor> fornecedor = getFornecedor();
       
       for(Fornecedor f : fornecedor){
           if(f.getNome().equals(nome)){
               return f;
           }
       }
       return null;
    }

    /**
     * Método utilizado para atualizar os dados do Fornecedor.
     * 
     * @param f
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    
    @Override
    public boolean atualizarDadosFornecedor(Fornecedor f) throws IOException, ClassNotFoundException {
        Set<Fornecedor> fornecedor = getFornecedor();
        
        for(Fornecedor fornecedores : fornecedor){
            if(fornecedores.getCnpj() == f.getCnpj()){
                fornecedor.remove(fornecedores);
                fornecedor.add(f);
                atualizarArquivos(fornecedor);
                return true;
            }
        }
        return false;
    }

    /**
     * Método para atualizar os dados do Fornecedor.
     * 
     * @param fornecedor
     * @throws FileNotFoundException
     * @throws IOException 
     */
    
    private void atualizarArquivos(Set<Fornecedor> fornecedor) throws FileNotFoundException, IOException {
        ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(arquivoFornecedor));
       
        out.writeObject(fornecedor);
        out.close();
    }

   
}
