package PA;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        boolean returned = false;
        try {
            returned = PA.generic.CmdInterface.yesno("test?", 'n');
        }catch(Exception e) {
            System.out.println("Problema desconhecido encontrado. A terminar o programa.");
        }
        System.out.println(returned);
    }
}
