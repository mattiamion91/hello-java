
/*
Esercizio 1 — if/else: scrivi un programma che chieda un numero da tastiera e stampi se è positivo, negativo, o zero (tre casi, con if/else if/else).

Esercizio 2 — ternario: dato un int eta, usa l'operatore ternario per stampare "Puoi guidare" se eta >= 18, altrimenti "Non puoi guidare".

Esercizio 3 — switch: chiedi all'utente un numero da 1 a 7 (Scanner) e usa uno switch per stampare il nome del giorno della settimana corrispondente (1 = Lunedì, ..., 7 = Domenica). Gestisci anche il caso di numero non valido con default.
 */
import java.util.Scanner; //importo lo scanner

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creo una variabile scanner per inserimeto dati da tastier
        System.out.print("inserisci un numero ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("il numero inserito é positivo");
        } else if (num < 0) {
            System.out.println("il numero inserito é negativo");
        } else {
            System.out.println("il numero inserito é ZERO!!");
        }

        int yourAge = 26;
        String canYouDrive = (yourAge >= 18) ? "Si! Puoi guidare" : "NO! non puoi guidare";
        System.out.println(canYouDrive);

        System.out.print("inserisci un numero da 1 a 7 ");
        int numWeek = scanner.nextInt();
        String nomeGiorno;
        switch (numWeek) {
            case 1:
                nomeGiorno = "Lunedí";
                break;
            case 2:
                nomeGiorno = "Martedí";
                break;
            case 3:
                nomeGiorno = "Mercoledí";
                break;
            case 4:
                nomeGiorno = "Giovedí";
                break;
            case 5:
                nomeGiorno = "Venerdí";
                break;
            case 6:
                nomeGiorno = "Sabato";
                break;
            case 7:
                nomeGiorno = "Domenica";
                break;
            default:
                nomeGiorno = "Miserabile!! ti avevo detto di inserire un numero da 1 a 7!!";
                break;
        }
        System.out.println(nomeGiorno);
    }

}
