import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int menu=menu();


    }
    public static int menu(){
        Scanner input=new Scanner(System.in);

        int op=0;

            System.out.println("Benvingut al joc del lobo de cachonegro\n" +
                    "Seleccioneu una de les opcions disponibles per a jugar: \n" +
                    "1. 6 jugadors (2 llops 4 pueblerins)\n 2. 8 jugadors (2 llops 5 pueblerins 1 vident)\n" +
                    "3. 12 jugadors (3 llops 7 pueblerins 1 bruixa 1 vident)\n 4. Sortir ");
            op=input.nextInt();

        switch (op) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            default:
                System.out.println("ERROR: Opció no vàlida!");
                menu(); // Cas recursiu
                break;
        }
        return op;
    }

}