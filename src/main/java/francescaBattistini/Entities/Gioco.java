package francescaBattistini.Entities;



public abstract class Gioco {
    private int idGioco;
    private String titolo;
    private int annoProduzione;
    private double prezzo;


    public Gioco(int idGioco, String titolo, int annoProduzione, double prezzo) {
        this.idGioco = idGioco;
        this.titolo = titolo;
        this.annoProduzione = annoProduzione;
        this.prezzo = prezzo;
    }

    public int getIdGioco()
    {return idGioco;}

    public void setIdGioco(int idGioco)
    {this.idGioco = idGioco;}

    public String getTitolo()
    {return titolo;}

    public void setTitolo(String titolo)
    {this.titolo = titolo;}

    public int getAnnoProduzione()
    {return annoProduzione;}

    public void setAnnoProduzione(int annoProduzione)
    {this.annoProduzione = annoProduzione;}

    public double getPrezzo()
    {return prezzo;}

    public void setPrezzo(double prezzo)
    {this.prezzo = prezzo;}

    @Override
    public String toString() {
        return "Gioco{" +
                "idGioco=" + idGioco +
                ", titolo='" + titolo + '\'' +
                ", annoProduzione=" + annoProduzione +
                ", prezzo=" + prezzo +
                '}';
    }
}