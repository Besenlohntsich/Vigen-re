import java.util.InputMismatchException;
import java.util.Scanner;

public class Verwaltung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vigenere vigenere = new Vigenere();
        int option;

        do {
            System.out.println("Wähle eine Option:");
            System.out.println("0 - Beenden");
            System.out.println("1 - Verschlüsseln");
            System.out.println("2 - Entschlüsseln");

            //verhindert crash durch eingabe einen falschen datentyps
            while (true) {
                try {
                    option = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ungültige Eingabe. Bitte eine Zahl eingeben.");
                    sc.next();
                }
            }


            switch (option) {
                case 0:
                    //spiegelt den wert von option wider und vergleicht diesen
                    System.out.println("Programm wird beendet.");
                    break;
                case 1:
                    System.out.println("Gebe eine Nachricht zum Verschlüsseln ein:");
                    vigenere.setKt(sc.nextLine());

                    System.out.print("Gebe den Buchstaben Schlüssel ein:");
                    vigenere.setS(sc.nextLine());


                    vigenere.verschluesseln();
                    System.out.println("Verschlüsselte Nachricht: " + vigenere.getGt());
                    break;
                case 2:
                    System.out.println("Gebe die verschlüsselte Nachricht ein:");
                    vigenere.setGt(sc.nextLine());

                    System.out.print("Gebe den Buchstaben Schlüssel ein:");
                    vigenere.setS(sc.nextLine());


                    vigenere.entschluesseln();
                    System.out.println("Entschlüsselte Nachricht: " + vigenere.getKt());
                    break;
                default:
                    System.out.println("Ungültige Option, bitte wähle erneut.");
            }
        } while (option != 0);
        //ruft alles unter dem do wieder auf, wenn option ungleich 0 ist
        sc.close();
    }
}