package francescaBattistini;

import francescaBattistini.Entities.*;

public class Application {

    public static void main(String[] args) {
        Collezione collezione = new Collezione();
        VideoGiochi game1 = new VideoGiochi(12345, "the Witcher-wild hunt", 2015, 30.00, "Play", 60, Genere.AVVENTURA);
        GiochiDaTavolo gtavola1 = new GiochiDaTavolo(23455, "Risico", 1995, 16.25, 4, 60);
        VideoGiochi game2 = new VideoGiochi(78906, "Zelda", 1998, 40.25, "gameboy", 40, Genere.AVVENTURA);
        GiochiDaTavolo gtavola2 = new GiochiDaTavolo(23455, "Cluedo", 1995, 15.36, 4, 30);

// essercizio 1
        collezione.aggiungiGioco(gtavola1);
        collezione.aggiungiGioco(gtavola2);//test
        collezione.aggiungiGioco(game1);
        collezione.aggiungiGioco(game2);

        System.out.println(collezione);

//esercizio 2
        Gioco ricercaPerId = collezione.ricercaID(12345);
        System.out.println("Il gioco che cercavi è : " + ricercaPerId.getTitolo());

        //esercizio3
        System.out.println(collezione.ricercaPerPrezzo(16));

        //4.
        System.out.println(collezione.searchforgamers(4));

        //5.
        System.out.println(collezione.rimoviElemendoDaId(12345));
    }
}
