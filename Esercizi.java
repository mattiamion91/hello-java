import java.util.Scanner;

/*
Esercizio 1: Dichiara variabili per rappresentare te stesso — nome (String), età (int), altezza in metri (double), se sei uno studente/lavoratore a tua scelta (boolean) — e stampale tutte con System.out.println.

Esercizio 2: Dichiara due variabili int (es. a = 10, b = 3) e stampa il risultato di somma, sottrazione, moltiplicazione e divisione tra loro.

Esercizio 3 (tranello classico): prova a stampare 10 / 3 (due interi) e poi 10.0 / 3 (un decimale e un intero). Guarda bene i due risultati: sono uguali? Prova a spiegarti perché (non ti do la risposta subito, voglio vedere cosa noti).
*/

/*
Esercizio 1 — Cast: dichiara double prezzo = 47.89; e stampa il suo valore convertito con il cast a int. Prova anche con un numero negativo, tipo double temperatura = -7.6;, e osserva il risultato del cast.

Esercizio 2 — Scanner: scrivi un programma che chieda all'utente il suo nome (stringa) e la sua età (intero) da tastiera, poi stampi un messaggio personalizzato e un boolean che indica se è maggiorenne.

Esercizio 3 — Operatori logici: chiedi all'utente due numeri interi (Scanner), poi stampa: se sono entrambi positivi (&&), se almeno uno dei due è pari (usa l'operatore % — resto della divisione — per capire se un numero è pari: numero % 2 == 0), e se sono diversi tra loro (!=).
*/

public class Esercizi {
    public static void main(String[] arg) {
        String nome = "Mattia";
        int etá = 35;
        double altezza = 1.79;
        boolean isStudent = false;

        System.out.println("mi chiamo " + nome + " ho " + etá + " anni " + " sono alto " + altezza);
        System.out.println(isStudent);

        int a = 10;
        int b = 3;
        double c = 10.0;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(c / b);

        System.out.println(10 / 3);
        System.out.println(-10 / 3);
        System.out.println(10.0 / 3);

        double prezzo = 47.89;
        int prezzoIntero = (int) prezzo;

        double temp = -7.9;
        int tempInt = (int) temp;

        System.out.println("il prezzo intero é " + prezzoIntero + " e la temperatura é " + tempInt);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Come ti chiami? ");
        String nome2 = scanner.nextLine();

        System.out.print("Quanti anni hai? ");
        int etá2 = scanner.nextInt();

        System.out.println("mi chiamo " + nome2 + " e ho " + etá2 + " anni ");

        System.out.print("inserisci un numero ");
        int num1 = scanner.nextInt();
        System.out.print("inserisci un altro numero ");
        int num2 = scanner.nextInt();
        if (num1 > 0 && num2 > 0) {
            System.out.println("entrambi i numeri sono positivi");
        }
        if (num1 % 2 == 0 || num2 % 2 == 0) {
            System.out.println("almeno uno dei due numeri é pari");
        }
        if (num1 != num2) {
            System.out.println("i numeri sono diversi tra loro");
        }
    }
}
