import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int speedLim, yourSpeed, eccesso, multa;
        String plate;
        String ancora;

    do { System.out.println("Inserisci il limite di velocità: ");
    speedLim = sc.nextInt();
    sc.nextLine();

    System.out.println("La tua targa: ");
    plate = sc.nextLine();

    System.out.println("La tua velocità: ");
    yourSpeed = sc.nextInt();
    sc.nextLine();

    Map<Integer,Integer> sanzioni = new LinkedHashMap<>();
    sanzioni.put(5, 0);
    sanzioni.put(10, 60);
    sanzioni.put(30, 200);
    sanzioni.put(50, 500);
    sanzioni.put(999, 1000);

    eccesso = yourSpeed - speedLim;
    Map<String,Integer> importo = new LinkedHashMap<>();
    for (Integer n : sanzioni.keySet()) {
        if (n >=eccesso) {
            multa = sanzioni.get(n);
            System.out.println("La tua multa è di " + multa + " euro.");
            
            importo.put(plate, multa);
            

            break;
            

        
        }
        
    }
    System.out.println(importo.toString());
    System.out.println("Vuoi effettuare una nuova rilevazione? s/n");
    ancora=sc.nextLine();


        
    } while (ancora.equalsIgnoreCase ("s"));



    System.out.println("Rilevazione terminata!");
    



        

        sc.close();
    }
}
