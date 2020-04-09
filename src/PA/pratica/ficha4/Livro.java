package PA.pratica.ficha4;

//nao definir se é publico ou privado nao cria a variavel
class Livro {
    private String titulo, autor;
    private final int codigo;

    public Livro(int code, String autor, String titulo) {
        codigo = code;
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
    public int hashCode(){ return getCodigo(); }

    
}
