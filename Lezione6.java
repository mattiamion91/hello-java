/*Lezione 6 — Array e String in profondità
Teoria
Array: ripasso e novità

Hai già visto un array semplice:

java
int[] numeri = {4, 8, 15, 16, 23, 42};

Alcune cose importanti da formalizzare:

.length → proprietà (non metodo, niente parentesi!) che dice quanti elementi ha l'array:
java
System.out.println(numeri.length); // 6
Accesso per indice, partendo da 0:
java
System.out.println(numeri[0]); // 4 (primo elemento)
System.out.println(numeri[5]); // 42 (ultimo elemento, indice = length - 1)
Dimensione fissa: un array, una volta creato, non può crescere o rimpicciolirsi. Se ti serve una collezione che cambia dimensione dinamicamente, 
servirà ArrayList (l'avevi già usata in Spring Boot con List<Todo> — ci torneremo presto in modo più formale).
Creazione con dimensione fissa, senza valori iniziali:
java
int[] voti = new int[5]; // array di 5 interi, tutti inizializzati a 0
voti[0] = 7;
voti[1] = 8;
For classico vs for-each su array:
java
for (int i = 0; i < numeri.length; i++) {
    System.out.println(numeri[i]);
}

Usi il for classico (con indice) quando ti serve conoscere la posizione dell'elemento, non solo il suo valore — cosa che il for-each non ti dà.

String: metodi utili

String in Java è ricchissima di metodi utili. I più comuni:

java
String testo = "Ciao Mondo";

testo.length()           // 10 → lunghezza della stringa
testo.toUpperCase()      // "CIAO MONDO"
testo.toLowerCase()      // "ciao mondo"
testo.charAt(0)          // 'C' → carattere alla posizione 0
testo.substring(0, 4)    // "Ciao" → sottostringa da indice 0 (incluso) a 4 (escluso)
testo.contains("Mondo")  // true
testo.replace("Mondo", "Java") // "Ciao Java"
testo.trim()             // rimuove spazi bianchi iniziali/finali
testo.split(" ")         // divide in un array di String: {"Ciao", "Mondo"}
testo.equals("Ciao Mondo") // true → confronto di VALORE (ricorda: mai == per le String!)

Nota fondamentale, da ricordare sempre: per confrontare due String usa sempre .equals(), mai ==. Ricordi il motivo da quando l'abbiamo visto con Long nel 
controller Spring Boot? == confronta se sono lo stesso oggetto in memoria, .equals() confronta il contenuto. Con le String questo errore è particolarmente 
comune e insidioso, perché a volte == sembra "funzionare per caso" (per un dettaglio di ottimizzazione interna di Java chiamato string pool), 
ma non è affidabile — usa sempre .equals().

Esempio completo
java
public class Esempio {
    public static void main(String[] args) {
        String frase = "Java è un linguaggio potente";

        System.out.println("Lunghezza: " + frase.length());
        System.out.println("Maiuscolo: " + frase.toUpperCase());

        String[] parole = frase.split(" ");
        System.out.println("Numero di parole: " + parole.length);

        for (String parola : parole) {
            System.out.println("- " + parola);
        }
    }
}
Esercizi

/*
         * Esercizio 1 — Array: dichiara un array di 5 interi con valori a tua scelta.
         * Scrivi un metodo static int somma(int[] array) che restituisce
         * la somma di tutti gli elementi (usa un ciclo for o for-each al suo interno).
         * Testalo nel main.
         */

/*Esercizio 2 — Array, massimo: scrivi un metodo static int trovaMassimo(int[] array) che restituisce il valore più grande dell'array 
(stessa logica dell'esercizio max di prima, ma generalizzata per un array di qualsiasi dimensione, non solo 3 numeri fissi).

Esercizio 3 — String: chiedi all'utente il suo nome completo (Scanner, nextLine()). Usa .split(" ") per dividerlo in un array di parole (nome e cognome), 
poi stampa: il nome in maiuscolo, quante lettere ha il cognome (.length()), e se il nome contiene la lettera "a" (usa .contains()
— attenzione a maiuscole/minuscole, potrebbe servirti .toLowerCase() prima del controllo).

Prenditi il tuo tempo!*/

import java.util.Scanner;

public class Lezione6 {

    // metodo per restituire il valore piu alto in un array
    static int trovaMassimo(int[] array) {
        int maxVal = array[0];
        for (int numero : array) {
            if (numero > maxVal)
                maxVal = numero;
        }
        return maxVal;
    }

    // metodo per sommare numeri dentro un array
    public static int somma(int[] array) {
        int sum = 0;
        for (int numero : array) {
            sum += numero;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci nome e cognome: ");
        String fullName = scanner.nextLine();
        String[] splittedName = fullName.split(" ");
        System.out.println(splittedName[0].toUpperCase());
        System.out.println(splittedName[1].length());
        System.out.println(splittedName[0].toLowerCase().contains("a"));


        int[] numbers = { -2, -3, -1024, -7, -111 };
        int risultato = somma(numbers);
        int risultatoTrovaMassimo = trovaMassimo(numbers);
        System.out.println("la somma é " + risultato);
        System.out.println("il valore massimo é " + risultatoTrovaMassimo);

        String frase = "Java è un linguaggio potente";

        System.out.println("Lunghezza: " + frase.length());
        System.out.println("Maiuscolo: " + frase.toUpperCase());

        String[] parole = frase.split(" ");
        System.out.println("Numero di parole: " + parole.length);

        for (String parola : parole) {
            System.out.println("- " + parola);
        }

    }
}