package br.com.livraria.controle;

import br.com.livraria.modelo.Livro;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

public class LivroDaoArquivo implements LivroDao{
    
    private File arquivoLivro;

    public LivroDaoArquivo() throws IOException {
        arquivoLivro = new File("Livro");
        
        if(!arquivoLivro.exists()){
            arquivoLivro.createNewFile();
        }
    }
    
    @Override
    public Set<Livro> getLivro() throws IOException, ClassNotFoundException {
       if(arquivoLivro.length()>0){
           try(ObjectInputStream l = new ObjectInputStream(
                new FileInputStream(arquivoLivro)
           )){
               return (HashSet) l.readObject();
           }
       }else{
           return new HashSet<>();
       }
    }

    @Override
    public boolean salvar(Livro livro) throws IOException, ClassNotFoundException {
        if (buscar(livro.getCod_Barra()) == null){
          Set<Livro> l = getLivro();
          
          if(l.add(livro)){
             atualizarArquivos(l);
             return true;
          }else{
              return false;
          }
          
        }else{
            return false;
        }
            
    }

    @Override
    public boolean deletar(Livro livro) throws IOException, ClassNotFoundException {
        Set<Livro> l = getLivro();
        
        if(l.remove(livro)){
            atualizarArquivos(l);
            return true;
        }else{
            return false;
        }
    }

   @Override
   public Livro buscar(String cod_Barra) throws IOException, ClassNotFoundException{
       Set<Livro> l = getLivro();
       
       for(Livro livro : l){
           if(livro.getCod_Barra().equals(cod_Barra)){
               return livro;
           }
       }
       return null;
   }
    

    @Override
    public boolean atualizar(Livro livro) throws IOException, ClassNotFoundException {
        Set<Livro> l = getLivro();
        
        for(Livro livros : l){
            if(livros.getCod_Barra().equals(livro.getCod_Barra())){
                l.remove(livros);
                l.add(livro);
                atualizarArquivos(l);
                return true;
            }
        }
        return false;
    }

    private void atualizarArquivos(Set<Livro> l) throws FileNotFoundException, IOException {
        ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(arquivoLivro));
       
        out.writeObject(l);
    }

  }
