package PA.pratica.ficha1;

import java.util.*;

public class Ex2 {
    public static void RandomUser() {
        System.out.println("Pense número que é existe entre 1 e 100 inclusivo.");
        int maiorque = 0, menorque = 101, palpite;
        int certo = 0, tentativas = 0;

        Scanner sc = new Scanner(System.in);
        do {
            palpite = Math.round(((menorque - maiorque) / 2) + maiorque);
            if (PA.generic.CmdInterface.yesno("[Tentativa nº" + ++tentativas + "]O valor que pensas-te foi " + palpite + "?", 'n')) {
                break;
            }
            if (PA.generic.CmdInterface.yesno("O valor que pensas-te é inferiror a " + palpite + "?", 'Y'));

        } while (certo == 0);
        System.out.println("Demorou " + tentativas + " tentativas, para obter o número " + palpite + ".");

    }

}
