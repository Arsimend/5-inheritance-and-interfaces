package rajapintaesimerkki;

public class Kissa implements Aantelee{
    private  String nimi;
    
    public String anntele(){
        return "MiauMiau";
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

}
