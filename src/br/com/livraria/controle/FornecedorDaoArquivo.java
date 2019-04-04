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

public class FornecedorDaoArquivo implements FornecedorDao{
        private File arquivoFornecedor;

    public FornecedorDaoArquivo() throws IOException {
        arquivoFornecedor = new File("Fornecedor.bin");
        
        if(!arquivoFornecedor.exists()){
            arquivoFornecedor.createNewFile();
        }
    }
    
    
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

    @Override
    public boolean salvar(Fornecedor f) throws IOException, ClassNotFoundException {
        Set<Fornecedor> fornecedor = getFornecedor();
        fornecedor.add(f);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoFornecedor));
        out.writeObject(fornecedor);
        out.close();
        return true;
    }

    @Override
    public boolean deletar(Fornecedor f) throws IOException, ClassNotFoundException {
        Set<Fornecedor> fornecedor = getFornecedor();
        fornecedor.remove(f);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoFornecedor));
        out.writeObject(fornecedor);
        out.close();
        return true;
    }

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

    
    private void atualizarArquivos(Set<Fornecedor> fornecedor) throws FileNotFoundException, IOException {
        ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(arquivoFornecedor));
       
        out.writeObject(fornecedor);
        out.close();
    }

   
}
