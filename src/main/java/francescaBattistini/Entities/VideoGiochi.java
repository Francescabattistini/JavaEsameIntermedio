package francescaBattistini.Entities;

public class VideoGiochi extends Gioco {
    private String piattaforma;
    private int oreGioco;
    private Genere genere;


    public VideoGiochi(int idGioco, String titolo, int annoProduzione, double prezzo, String piattaforma, int oreGioco, Genere genere) {
        super(idGioco, titolo, annoProduzione, prezzo);
        this.piattaforma = piattaforma;
        this.oreGioco = oreGioco;
        this.genere = genere;
    }

    public String getPiattaforma()
    {return piattaforma;}

    public void setPiattaforma(String piattaforma)
    {this.piattaforma = piattaforma;}

    public int getOreGioco()
    {return oreGioco;}

    public void setOreGioco(int oreGioco)
    {this.oreGioco = oreGioco;}

    public Genere getGenere()
    {return genere;}

    public void setGenere(Genere genere)
    {this.genere = genere;}

    @Override
    public String toString() {
        return "VideoGiochi{" +
                "piattaforma='" + piattaforma + '\'' +
                ", oreGioco=" + oreGioco +
                ", genere=" + genere +
                '}';
    }
}
