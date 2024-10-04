package francescaBattistini.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Collezione {
 private List<Gioco> giochi;


public Collezione(){
    giochi = new ArrayList<>();
}
//1 aggiungo un elemento (non deve essere possibile inserire un elemento con lo stesso ID

    public void aggiungiGioco(Gioco nuovoGioco) {
    try {
        for (Gioco gioco : giochi) {
            if (gioco.getIdGioco() == nuovoGioco.getIdGioco()) {
                throw new Exception("Errore: esiste già un gioco con quell'ID " + nuovoGioco.getIdGioco());
            }
        }
        giochi.add(nuovoGioco);

        System.out.println("Gioco aggiunto: " + nuovoGioco.getTitolo());

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
    // 2.ricerca per ID
    public Gioco ricercaID(int id) {
        try {
            for (Gioco gioco : giochi) {
                if (gioco.getIdGioco() == id) {
                    return gioco;
                }
            }
            throw new NoSuchElementException("siamo spiacenti,  " + id + " non trovato. ");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    //3. ricerca gioco, per prezzo deve ritornare una lista di giochi inferiore al prezzo inserito.
    public List<Gioco> ricercaPerPrezzo(double prezzoscelto) {
        return giochi.stream().filter(g -> g.getPrezzo() < prezzoscelto)
                .collect(Collectors.toList());
    }
    //4.cerca per numero giocatori
//DA VEDERE NON MI CONVINCE
    public List<GiochiDaTavolo> searchforgamers(int numGamers) {
        try {
            if (numGamers < 2 || numGamers > 10) {
                throw new IllegalArgumentException("Il numero di giocatori deve essere compreso tra 2 e 10.");
            }

            return giochi.stream()
                    .filter(g -> g instanceof GiochiDaTavolo)
                    .map(g -> (GiochiDaTavolo) g)
                    .filter(g -> g.getNumeroGiocaori() == numGamers)
                    .collect(Collectors.toList());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
            return List.of();
        }
}
//5.
public boolean rimoviElemendoDaId(int idGioco) {
    try {
        Gioco giocoDaRimuovere = giochi.stream()
                .filter(g -> g.getIdGioco() == idGioco)
                .findFirst()
                .orElse(null);
        if (giocoDaRimuovere == null) {
            throw new Exception("Gioco con ID " + idGioco + " non trovato.");
        }
        giochi.remove(giocoDaRimuovere);
        System.out.println("Gioco con ID " + idGioco + " rimosso con successo.");
    } catch (Exception e) {
        System.out.println("Errore: " + e.getMessage());
    }
    return false;
}





    }


