package PA;

import PA.pratica.ficha3.ex2.Biblioteca;

public class Main {

    public static void main(String[] args) {


        boolean returned = false;
        try {
            Biblioteca bi = new Biblioteca("Santos");
            bi.addLivro( "Jónas", "A arte de beber");
            System.out.println("lista de livros:");
            System.out.println(bi.listaLivros());
        }catch(Exception e) {
            System.out.println("Problema desconhecido encontrado. A terminar o programa.");
            return;
        }
        //System.out.println(returned);
    }
    private static int choiceSystem(){
        int returnable = 0;
        return 0;
    };
}
