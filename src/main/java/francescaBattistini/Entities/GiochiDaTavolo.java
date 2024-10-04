package francescaBattistini.Entities;

public class GiochiDaTavolo extends Gioco{
    private int numeroGiocaori;
    private int durataMediaPartita;

    public GiochiDaTavolo(int idGioco, String titolo, int annoProduzione,
                          double prezzo, int numeroGiocaori, int durataMediaPartita) {
        super(idGioco, titolo, annoProduzione, prezzo);
        this.numeroGiocaori = numeroGiocaori;
        this.durataMediaPartita = durataMediaPartita;
    }
    public int getNumeroGiocaori()
    {return numeroGiocaori;}

    public void setNumeroGiocaori(int numeroGiocaori)
    {this.numeroGiocaori = numeroGiocaori;}

    public int getDurataMediaPartita()
    {return durataMediaPartita;}

    public void setDurataMediaPartita(int durataMediaPartita)
    {this.durataMediaPartita = durataMediaPartita;}

    @Override
    public String toString() {
        return "GiochiDaTavolo{" +
                "numeroGiocaori=" + numeroGiocaori +
                ", durataMediaPartita=" + durataMediaPartita +
                '}';
    }
}
