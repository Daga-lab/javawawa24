import java.util.Objects;
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
        Objects.requireNonNull(dlugosc);
        Objects.requireNonNull(szerokosc);
                int pole = dlugosc * szerokosc;

    }

   public void Obwod(){
       Objects.requireNonNull(dlugosc);
       Objects.requireNonNull(szerokosc);
        int obwod = 2*dlugosc + 2*szerokosc;
    }

    public void DlugoscPrzekatnej(){
        Objects.requireNonNull(dlugosc);
        Objects.requireNonNull(szerokosc);
       double dlugoscPrzekatnej = Math.sqrt((dlugosc*dlugosc)+(szerokosc*szerokosc)) ;
    }


}
