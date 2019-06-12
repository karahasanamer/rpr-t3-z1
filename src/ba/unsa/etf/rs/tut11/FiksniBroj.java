package ba.unsa.etf.rs.tut11;

import java.io.FileReader;

public class FiksniBroj extends TelefonskiBroj {

   private Grad grad;
   private String broj;
   enum Grad{SARAJEVO,TUZLA,ZENICA};

   FiksniBroj(Grad grad, String broj){
       this.grad=grad;
       this.broj=broj;
   }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String ispisi() {


        if(grad == Grad.SARAJEVO) return "033/"+broj;
        if(grad == Grad.TUZLA) return "036/"+broj;
        if(grad == Grad.ZENICA) return"032/"+broj;


       return "";
    }

    @Override
    public int hashCode() {
        return 0;
    }


}
