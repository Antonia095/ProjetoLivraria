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
        arquivoLivro = new File("Livro.bin");
        
        if(!arquivoLivro.exists()){
            arquivoLivro.createNewFile();
        }
    }
    
    @Override
    public Set<Livro> getLivro() throws IOException, ClassNotFoundException {
       Set<Livro> livro;
       if(arquivoLivro.length()>0){
           ObjectInputStream l = new ObjectInputStream( new FileInputStream(arquivoLivro));
           livro = (Set<Livro>) l.readObject();
           l.close();
        }else{
         livro = new HashSet<>();
       }
       return livro;
    }

    @Override
    public boolean salvar(Livro l) throws IOException, ClassNotFoundException {
        Set<Livro> livro = getLivro();
        livro.add(l);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoLivro));
        out.writeObject(livro);
        out.close();
        return true;
    }

    @Override
    public boolean deletar(Livro l) throws IOException, ClassNotFoundException {
        Set<Livro> livro = getLivro();
        livro.remove(l);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoLivro));
        out.writeObject(livro);
        out.close();
        return true;
    }

   @Override
   public Livro buscar(String codBarra) throws IOException, ClassNotFoundException{
       Set<Livro> livro = getLivro();
       
       for(Livro l : livro){
           if(l.getCodBarra().equals(codBarra)){
               return l;
           }
       }
       return null;
   }
    

    @Override
    public boolean atualizar(Livro l) throws IOException, ClassNotFoundException {
        Set<Livro> livro = getLivro();
        
        for(Livro livros : livro){
            if(livros.getCodBarra().equals(l.getCodBarra())){
                livro.remove(livros);
                livro.add(l);
                atualizarArquivos(livro);
                return true;
            }
        }
        return false;
    }

    private void atualizarArquivos(Set<Livro> livro) throws FileNotFoundException, IOException {
        ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(arquivoLivro));
       
        out.writeObject(livro);
        out.close();
    }

  }
