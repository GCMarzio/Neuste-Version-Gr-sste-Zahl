import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Max{

    /***
     * ljhliugiug
     * @param Marzio
     * @return
     */
    static int max(List<Integer> Marzio)  {
        // Entstehung des Variable Marzio.

        int max = Marzio.get(0);
        for (int i:Marzio) {
            if (max < i){
                max = i;
            }
        }

        return max;
    }
    public static void main(String[] args) {

        List<Integer> AusgabeZahlen = getNumbers();

        if (AusgabeZahlen.stream().count() >= 0) {
            int max = max(AusgabeZahlen);
            System.out.printf("Die höchste Zahl ist: %d%n", max); // Ausgabe für die grösste Zahl.
            // Auwertungssatz
        }else {
            System.out.println("Keine Zahl eingegeben!");
        }
    }

    public static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++){ // Formel für Numereingabe.
            numbers.add(getNumber());
        }

        return numbers;
    }

    public static int getNumber(){

        System.out.println("Bitte Nummer eingeben:");

        boolean throwsException = false;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                return number;
            }catch (Exception e) {
                System.out.println("Falsche Eingabe!"); // Ausgabe für falsche Eingabe.
                throwsException = true;
            }
        } while (throwsException);

        return getNumber();
    } // Code falls man einen Buchstaben eingibt.
}

