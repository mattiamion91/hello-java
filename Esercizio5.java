/*
Esercizi

Esercizio 1: scrivi un metodo static int quadrato(int n) che restituisce il quadrato di un numero. Richiamalo nel main per un paio di numeri diversi e stampa i risultati.

Esercizio 2: scrivi un metodo static boolean isPrimo(int n) che restituisce true se il numero è primo, false altrimenti (un numero è primo se divisibile solo per 1 e per se stesso — dovrai usare un ciclo for al suo interno). Testalo con alcuni numeri, sia primi che non.

Esercizio 3: scrivi un metodo static int max(int a, int b, int c) che restituisce il valore più grande tra tre numeri interi (senza usare metodi già pronti come Math.max, prova a ragionarci con if).
*/

public class Esercizio5 {

    // Metodo che NON ritorna nulla (void)
    public static void saluta(String nome) {
        System.out.println("Ciao " + nome + "!");
    }

    // Metodo che ritorna un valore
    public static int somma(int a, int b) {
        return a + b;
    }

    // Metodo con logica più articolata
    public static boolean isPari(int numero) {
        return numero % 2 == 0;
    }

    // metodo static int che restituisce il quadrato di un numero
    public static int quadrato(int n) {
        return n * n;
    }

    // metodo static int che restituisce true o false se il numero é primo
    public static boolean isPrimo(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // metodo static int max che restituisce numero piu grande
    public static int max(int a, int b, int c) {
        int massimo = a;
        if(b > massimo) {
            massimo = b;
        }
        if(c > massimo) {
            massimo = c;
        }
        return massimo;
    }

    public static void main(String[] args) {
        saluta("Mattia");

        int risultato = somma(5, 3);
        System.out.println("5 + 3 = " + risultato);

        System.out.println("8 è pari? " + isPari(8));
        System.out.println("7 è pari? " + isPari(7));

        System.out.println("il quadrato é " + quadrato(5));
        System.out.println(isPrimo(9)); // false (3 x 3)
        System.out.println(isPrimo(7)); // true
        System.out.println(isPrimo(1)); // false
        System.out.println(isPrimo(2)); // true (occhio a questo, è un caso limite interessante)

        System.out.println(max(1,2,3));
        System.out.println(max(5,5,5));
    }
}
