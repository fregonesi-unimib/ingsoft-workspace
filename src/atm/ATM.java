package atm;

import java.util.Scanner;

public class ATM {
    private final Scanner scanner;

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.generaAbbonamento();
    }

    public ATM() {
        this.scanner = new Scanner(System.in);
    }

    public Abbonamento generaAbbonamento() {
        System.out.println("Generazione di un abbonamento ATM");

        System.out.println("Inserire il nome del destinatario: ");
        String nome = scanner.next();

        System.out.println("Inserire il cognome del destinatario: ");
        String cognome = scanner.next();

        System.out.println("Selezionare il tipo di abbonamento: ");
        System.out.println("1 - Ordinario\t2 - Ridotto\t3 - Over65");
        System.out.println("Selezione: ");
        int selezione = scanner.nextInt();
        TipoAbbonamento tipoAbbonamento = resolveTipo(selezione);


        System.out.println("Selezionare la durata:");
        System.out.println("1 - Giornalierio\t2 - Mensile\t3 - Annuale");
        System.out.println("Selezione: ");

        int durata = scanner.nextInt();
        Abbonamento abbonamento;
        if (durata == 1)
            abbonamento = new AbbonamentoGiornaliero(nome, cognome, tipoAbbonamento);
        else if (durata == 2)
            abbonamento = new AbbonamentoMensile(nome, cognome, tipoAbbonamento);
        else if (durata == 3)
            abbonamento = new AbbonamentoAnnuale(nome, cognome, tipoAbbonamento);
        else
            throw new RuntimeException("Codice non valido");

        System.out.println("Abbonamento generato! Riepilogo: \n" + abbonamento.toString());
        return abbonamento;
    }

    private TipoAbbonamento resolveTipo(int code) {
        if (code == 1)
            return TipoAbbonamento.ORDINARIO;
        else if (code == 2)
            return TipoAbbonamento.RIDOTTO;
        else if (code == 3)
            return TipoAbbonamento.OVER65;
        else
            throw new RuntimeException("Codice non valido");
    }
}
