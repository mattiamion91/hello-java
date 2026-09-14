/*
Esercizio 1: Dichiara variabili per rappresentare te stesso — nome (String), età (int), altezza in metri (double), se sei uno studente/lavoratore a tua scelta (boolean) — e stampale tutte con System.out.println.

Esercizio 2: Dichiara due variabili int (es. a = 10, b = 3) e stampa il risultato di somma, sottrazione, moltiplicazione e divisione tra loro.

Esercizio 3 (tranello classico): prova a stampare 10 / 3 (due interi) e poi 10.0 / 3 (un decimale e un intero). Guarda bene i due risultati: sono uguali? Prova a spiegarti perché (non ti do la risposta subito, voglio vedere cosa noti).
*/

public class Esercizio1 {
public static void main (String[] arg) {
    String nome = "Mattia";
    int etá = 35;
    double altezza = 1.79;
    boolean isStudent = false;

    System.out.println("mi chiamo " + nome + " ho " + etá + " anni " + " sono alto " + altezza);   
    System.out.println(isStudent);

    int a = 10;
    int b = 3;
    double c = 10.0;

    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a/c);
}
}


