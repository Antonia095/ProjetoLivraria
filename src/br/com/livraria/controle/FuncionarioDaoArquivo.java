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
        arquivoFuncionario = new File("Funcionario.bin");
        
        if(!arquivoFuncionario.exists()){
            arquivoFuncionario.createNewFile();
        }
    }
    
    
    @Override
    public Set<Funcionario> getFuncionario() throws IOException, ClassNotFoundException {
        Set<Funcionario> funcionario;
       if(arquivoFuncionario.length()>0){
           ObjectInputStream f = new ObjectInputStream( new FileInputStream(arquivoFuncionario));
           funcionario = (Set<Funcionario>) f.readObject();
           f.close();
        }else{
         funcionario = new HashSet<>();
       }
       return funcionario;
    }

    @Override
    public boolean salvar(Funcionario f) throws IOException, ClassNotFoundException {
        Set<Funcionario> funcionario = getFuncionario();
        funcionario.add(f);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoFuncionario));
        out.writeObject(funcionario);
        out.close();
        return true;
    }

    @Override
    public boolean deletar(Funcionario f) throws IOException, ClassNotFoundException {
        Set<Funcionario> funcionario = getFuncionario();
        funcionario.remove(f);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoFuncionario));
        out.writeObject(funcionario);
        out.close();
        return true;
    }

    @Override
    public Funcionario buscar(String cpf) throws IOException, ClassNotFoundException {
        Set<Funcionario> funcionario = getFuncionario();
       
       for(Funcionario f : funcionario){
           if(f.getCpf() == cpf){
               return f;
           }
       }
       return null;
    }

    @Override
    public boolean atualizar(Funcionario f) throws IOException, ClassNotFoundException {
        Set<Funcionario> funcionario = getFuncionario();
        
        for(Funcionario funcionarios : funcionario){
            if(funcionarios.getCpf() == f.getCpf()){
                funcionario.remove(funcionarios);
                funcionario.add(f);
                atualizarArquivos(funcionario);
                return true;
            }
        }
        return false;
    }

    

    
    private void atualizarArquivos(Set<Funcionario> funcionario) throws FileNotFoundException, IOException {
        ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(arquivoFuncionario));
       
        out.writeObject(funcionario);
        out.close();
    }

    
   
 }

    

    
    

