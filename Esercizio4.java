
/*
Esercizio 1 — for: stampa tutti i numeri pari da 0 a 20 (usa l'operatore % che hai già usato prima).

Esercizio 2 — while + somma: chiedi numeri all'utente uno alla volta (Scanner) finché non inserisce 0; alla fine stampa la somma totale di tutti i numeri inseriti (escluso lo 0 finale).

Esercizio 3 — array + for-each: dichiara un array di interi così:

java
int[] numeri = {4, 8, 15, 16, 23, 42};
*/
import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int somma = 0;
        int num;
        do {
            System.out.print("inserisci un numero ");
            num = scanner.nextInt();
            somma += num;
        } while (num != 0);
        System.out.println(somma);

        int[] numeri = {4, 8, 15, 16, 23, 42};

        for(int n : numeri) {
            if(n>10) {
                System.out.println(n);
            }            
        }
    }
}

