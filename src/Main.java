import java.sql.SQLOutput;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 07.12.2019
 */


public final class Main {

    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(10, 5);
        prostokat.Pole();
        System.out.println("Pole Prostokąta " + prostokat.Pole());
        prostokat.Obwod();
        System.out.println("Obwod Prostokata " + prostokat.Obwod());
        prostokat.DlugoscPrzekatnej();
        System.out.println("Dlugosc przekatnej prostokata " + prostokat.DlugoscPrzekatnej());

    }

    public static void pierwszeLiteryAlfabetu (){
        String [] alphabet = new String [10];
        alphabet[0] = "A";
        alphabet[1] = "B";
        alphabet[2] = "C";
        alphabet[3] = "D";
        alphabet[4] = "E";

    }

    public static void wyswietlImie () {
        System.out.println("Piotr");
    }


}


