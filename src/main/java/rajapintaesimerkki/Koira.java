package rajapintaesimerkki;
//jos luokkan pitää touttaa rajapinta on käytettava sana
//implements

public class Koira implements Aantelee{

    private String nimi;

  public String anntele (){
    return "hauhau";
    
  }

  public String getNimi() {
    return nimi;
  }

  public void setNimi(String nimi) {
    this.nimi = nimi;
  }

}
