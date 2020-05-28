package Ejercisio6;

import java.util.Scanner;

public class Ejercisio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int aleatorio;
        int i = 0;

        aleatorio = (int) Math.random() * 100;
        do {
            System.out.println(" digite un numero");
            n1 = entrada.nextInt();
            if (aleatorio > n1) {
                System.out.println(" digite un numero mayor");
            } else {
                System.out.println(" digite un numero menor");
            }
            i++;
        } while (n1 != aleatorio);

        System.out.println(" adivinaste el numero" + i + "intentos");
    }

}
