import java.util.Objects;
import java.util.function.Predicate;

/**
 * ... comment class ...
 *
 * @author maciej.jasinski2@gmail.com
 * @since 07.12.2019
 */
public final class Prostokat{
    private float dlugosc;
    private float szerokosc;

    public Prostokat(int dlugosc, int szerokosc) {
        Objects.requireNonNull(dlugosc);
        Objects.requireNonNull(szerokosc);
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }



    public void Pole() {
                float pole = dlugosc * szerokosc;
    }

   public void Obwod(){
        float obwod = 2*dlugosc + 2*szerokosc;
    }

    public void DlugoscPrzekatnej(){
       double dlugoscPrzekatnej = Math.sqrt((dlugosc*dlugosc)+(szerokosc*szerokosc)) ;
    }


}
