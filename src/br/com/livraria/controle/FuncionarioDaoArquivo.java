package br.com.livraria.controle;

import br.com.livraria.modelo.Funcionario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

public class FuncionarioDaoArquivo implements FuncionarioDao {
    
    private File arquivoFuncionario;

    public FuncionarioDaoArquivo() throws IOException {
        arquivoFuncionario = new File("Funcionário");
        
        if(!arquivoFuncionario.exists()){
            arquivoFuncionario.createNewFile();
        }
    }
    
    
    @Override
    public Set<Funcionario> getFuncionario() throws IOException, ClassNotFoundException {
        if(arquivoFuncionario.length()>0){
           try(ObjectInputStream f = new ObjectInputStream(
                new FileInputStream(arquivoFuncionario)
           )){
               return (HashSet) f.readObject();
           }
       }else{
           return new HashSet<>();
       }
    }

    @Override
    public boolean salvar(Funcionario funcionario) throws IOException, ClassNotFoundException {
        if (buscar(funcionario.getCpf()) == null){
          Set<Funcionario> f = getFuncionario();
          
          if(f.add(funcionario)){
             atualizarArquivos(f);
             return true;
          }else{
              return false;
          }
          
        }else{
            return false;
        }
    }

    @Override
    public boolean deletar(Funcionario funcionario) throws IOException, ClassNotFoundException {
        Set<Funcionario> f = getFuncionario();
        
        if(f.remove(funcionario)){
            atualizarArquivos(f);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Funcionario buscar(int cpf) throws IOException, ClassNotFoundException {
        Set<Funcionario> f = getFuncionario();
       
       for(Funcionario fun : f){
           if(fun.getCpf() == cpf){
               return fun;
           }
       }
       return null;
    }

    @Override
    public boolean atualizar(Funcionario funcionario) throws IOException, ClassNotFoundException {
        Set<Funcionario> f = getFuncionario();
        
        for(Funcionario fun : f){
            if(fun.getCpf() == funcionario.getCpf()){
                f.remove(fun);
                f.add(funcionario);
                atualizarArquivos(f);
                return true;
            }
        }
        return false;
    }

    private void atualizarArquivos(Set<Funcionario> f) throws FileNotFoundException, IOException {
        ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(arquivoFuncionario));
       
        out.writeObject(f);
    }
    
}
