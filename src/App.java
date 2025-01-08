import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int speedLim, yourSpeed, eccesso, multa;
        String plate;

        System.out.println("Inserisci il limite di velocità: ");
        speedLim = sc.nextInt();
        sc.nextLine();

        System.out.println("La tua targa: ");
        plate = sc.nextLine();

        System.out.println("La tua velocità: ");
        yourSpeed = sc.nextInt();
        sc.nextLine();

        Map<Integer,Integer> sanzioni = new LinkedHashMap<>();
        sanzioni.put(5, 60);
        sanzioni.put(10, 200);
        sanzioni.put(30, 500);
        sanzioni.put(50, 1000);

        eccesso = yourSpeed - speedLim;

        for (Integer n : sanzioni.keySet()) {
            if (n > eccesso) {
                multa = sanzioni.get(n);
                System.out.println("La tua multa è di " + multa + " euro.");
                break;
            }
            
        }
        

        sc.close();
    }
}
