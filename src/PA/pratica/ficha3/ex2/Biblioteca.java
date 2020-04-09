package PA.pratica.ficha3.ex2;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca implements Serializable {

    private final String nome;
    private List<Livro> livros;

    public Biblioteca(String nome){
        this.nome = nome;
        livros = new ArrayList<>();
    }

    public Biblioteca() {
       this.nome = "Biblioteca";
        livros = new ArrayList<>();
    }

    public String listaLivros(){
        String livrosstring = "";
        for(var i : livros ) {
            livrosstring += i.toString() + "\n";
        }
        return livrosstring;
    }

    public boolean acrescentaLivro(int codigo, String autor, String titulo) {
        return addLivro(autor, titulo);
    };

    public boolean addLivro( String autor, String titulo){
        try {
             return livros.add(new Livro( titulo, autor));
        }catch(Exception e) {
            return false;
        }
    }

    public Livro searchLivro(int codigo){
        return pesquisaLivro(codigo);
    }

    public Livro pesquisaLivro(int codigo){
        for(var i: livros){
            if(i.getCodigo() == codigo)
                return i;
        }
        return null;
    }

    public boolean eliminaLivro(int codigo){
        for(var i: livros){
            if(i.getCodigo() == codigo)
                return livros.remove(i);
        }
        return false;
    }

    @Override
    public String toString(){
        return "A biblioteca "+ nome + " tem " + livros.size() + " livros.";
    }
}

