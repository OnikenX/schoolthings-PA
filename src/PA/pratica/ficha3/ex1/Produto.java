package PA.pratica.ficha3.ex1;

import java.util.*;

public class Produto {
    private int nserie;
    private Date feito;
    private String estado = "nao testado";
    Produto(int ns){
        nserie = ns;
        feito = new Date();
    }

    public boolean testaUnidade() {
        if (estado == "aprovado") {
            return true;
        } else if (estado == "reprovado"){
            return false;
        }

        var probablidade = (Math.random() * 100);

        if (probablidade <= 90){
            estado = "aprovado";
            return true;
        }else {
            estado = "reprovado";
            return false;
        }
    }

    @Override
    public String toString(){
        return "Feito em" + feito.toString() + "e em estado " + estado;
    }

    @Override
    public int hashCode(){
        return nserie;
    }

    @Override
    public boolean equals(Object e){
        if (e == null)
            return false;

        if (!(e instanceof Produto)) {
            return false;
        }

        Produto aux = (Produto) e;

        return (aux.nserie == this.nserie);
    }

}
