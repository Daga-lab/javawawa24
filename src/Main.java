
/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 07.12.2019
 */


public final class Main {

    public static void main(String[] args) {

        Prostokat prostokat = new Prostokat(10,5);
        System.out.println(prostokat.Obwod());
        System.out.println(prostokat.toString());

        wyswietlImie();

        pierwszeLiteryAlfabetu();
    }

    public static void  pierwszeLiteryAlfabetu (){
        String [] alphabet = new String [10];
        alphabet[0] = "A";
        alphabet[1] = "B";
        alphabet[2] = "C";
        alphabet[3] = "D";
        alphabet[4] = "E";

        for (int i = 0; i<5; i++ ) {
            System.out.println(alphabet[i]);
        };
    }

    public static void wyswietlImie () {
        System.out.println("Piotr");
    }



}


