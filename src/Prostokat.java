import java.util.function.Predicate;

/**
 * ... comment class ...
 *
 * @author maciej.jasinski2@gmail.com
 * @since 07.12.2019
 */
public final class Prostokat{
    private int dlugosc;
    private int szerokosc;



    public void Pole() {
                int pole = dlugosc * szerokosc;

    }

   public void Obwod(){

        int obwod = 2*dlugosc + 2*szerokosc;
    }

    public void DlugoscPrzekatnej(){

       double dlugoscPrzekatnej = Math.sqrt((dlugosc*dlugosc)+(szerokosc*szerokosc)) ;
    }


}
