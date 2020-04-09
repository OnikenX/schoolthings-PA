package PA.pratica.ficha3.ex1;

import java.util.List;

public class Fabrica {
    private List<Produto> produtos;
    private int nprodutos = 0;
    public final String nome;

    Fabrica(String nome){
        this.nome = nome;
    }

    private int getnewid(){
        int start = 0;
        boolean existe;
        do {
            existe = false;
            for (var x : produtos) {
                if (start == x.hashCode()) {
                    ++start;
                    existe = true;
                    break;
                }
            }
        }while(existe);
    return start;
    }

    public boolean acrescentaProduto(){
                return produtos.add(new Produto(this.getnewid()));
    }

    Produto publicProduto(int s){
        for(var x : produtos){
            if(x.hashCode() == s)
                return x;
        }
        return null;
    }


}
