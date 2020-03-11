package PA.generic;

import java.util.*;

public class CmdInterface {
    //pede uma frase(ask) que sera a pergunta, um Scanner aberto na funcao main, e uma resposta de defaut que tera de ser y ou n

    public static boolean yesno(String ask) {
        return yesno(ask, '0');
    }

    public static boolean yesno(String ask, char respostadefault) {

        //Scanner start
        Scanner sc = new Scanner(System.in);

        //string com o sim e nao corretamente capitalizados
        String sn;

        //vezes pedidas informação, necessario para não se ter um loop infinito
        int times = 0;

        //defaultreturn define que default tera num enter e o bit para saber se tem um defaut ou não
        boolean defaultreturn = false, defaultreturnbit = false;

        //input character
        char input = '0';

        switch (respostadefault) {
            case 'S':
            case 's':
            case 'y':
            case 'Y':
                sn = "[S/n]";
                defaultreturn = true;
                defaultreturnbit = true;
                break;

            case 'N':
            case 'n':
                defaultreturn = false;
                defaultreturnbit = true;
                sn = "[s/N]";
                break;

            default:
                defaultreturnbit = false;
                sn = "[s/n]";
        }


        do {
            ++times;
            //limpa tudo anteriormente escrito
            System.out.println(ask + sn);
            try {
                sn = sc.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("Porfavor insira s ou n");
                continue;
            } catch (IllegalStateException e) {
                System.out.println("Output fechado.");
                break;
            }
            if (sn.length() != 0)
                try {

                    input = sn.charAt(0);
                } catch (Exception e) {
                    System.out.println("Não consigo buscar o primeiro caracter do input.");
                    break;
                }
            try {
                input = Character.toLowerCase(input);
            } catch (Exception e) {
                System.out.println("Não consigo transformar em minuscula. Talvez o caracter não tenha versão de minuscula no toLowerCase?");
                break;
            }
            switch (input) {
                case 's':
                case 'y':
                    return true;
                case 'n':
                    return false;
                case '0':
                    if (defaultreturnbit)
                        return defaultreturn;
                    break;
                default:
                    System.out.println("[input =" + input + "]S ou N please.");
            }
            ;

        } while (times < 20);


        System.out.println("Demasiadas tentativas. A enviar excepção...");
        throw new Error("Demasiadas tentativas.");
    }
}