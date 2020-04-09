package PA.pratica.ficha3.ex2;
import java.io.Serializable;

//nao definir se é publico ou privado nao cria a variavel
public class Livro implements Serializable {
    private String titulo, autor;
    private final int codigo;
    private static int serial;

    static {
        serial = 0;
    }

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
        codigo = ++serial;
    }

    public int getCodigo(){ return codigo; }

    @Override
    public boolean equals(Object e){
        if(e == null)
            return false;

        if(!(e instanceof Livro)){
            return false;
        }

        Livro it = (Livro) e;

        if(it.getCodigo() == this.getCodigo())
            return true;
        return false;
    }

    @Override
    public int hashCode(){
        return getCodigo();
    }

    @Override
    public String toString(){
        return "O Livro "+titulo+"foi escrito por " +autor+"." ;
    }
}
