package br.com.livraria.controle;

import br.com.livraria.modelo.Cadastro;
import br.com.livraria.modelo.Funcionario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroDaoArquivo implements CadastroDao {
    
    private File arquivo;

    public CadastroDaoArquivo() throws IOException {
        arquivo = new File("Usuario.bin");
        
        if(!arquivo.exists()){
            arquivo.createNewFile();
        }
       
    }
    
    
    @Override
    public Set<Cadastro> getCadastro() throws IOException, ClassNotFoundException {
        Set<Cadastro> usuario;
       if(arquivo.length()>0){
           ObjectInputStream u = new ObjectInputStream( new FileInputStream(arquivo));
           usuario = (Set<Cadastro>) u.readObject();
           u.close();
        }else{
         usuario = new HashSet<>();
       }
       return usuario;
    }

    @Override
    public boolean salvar(Cadastro u) throws IOException, ClassNotFoundException {
        Set<Cadastro> usuario = getCadastro();
        
        usuario.add(u);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
        out.writeObject(usuario);
        out.close();
        return true;
    }

     @Override
    public Cadastro acessar(String login, String senha) throws IOException, ClassNotFoundException {
        Set<Cadastro> usuario = getCadastro();
         
        for (Cadastro u : usuario){
            if(u.getLogin().equals(login) && u.getSenha().equals(senha)){
                return u;
            }
        }
        return null;
    }

    @Override
    public Cadastro buscar(String login) throws IOException, ClassNotFoundException {
        Set<Cadastro> usuario = getCadastro();
        
        for(Cadastro u : usuario){
            if(u.getLogin().equals(login)){
                return u;
            }
        }
        return null;
    }
    
}