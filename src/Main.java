import java.util.Scanner;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 07.12.2019
 */
final class Main {

    public static void main(String[] args) {
        System.out.println("WITAJCIE");
        System.out.println("nie");
        while (true) {
            System.out.println("Gdzie idziemy jesć");
            Scanner pytanie = new Scanner(System.in);
            System.out.println("Podaj nazwę miejsca");
            String pytanieOdp = pytanie.nextLine();
            if(pytanieOdp.equals("Gdziekolwiek")){
                break;
            }

        }

    }
}
