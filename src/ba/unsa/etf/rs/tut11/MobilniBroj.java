package ba.unsa.etf.rs.tut11;

public class MobilniBroj extends TelefonskiBroj {

     Integer mobilnaMreza;
     String broj;

    public MobilniBroj(Integer mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    public void setMobilnaMreza(int mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String ispisi() {


        return "0"+mobilnaMreza.toString()+"/"+broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
