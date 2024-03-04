import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String[][] player=new String[12][4];

    public static void main(String[] args) {

       int menu=menu();


    }

    /**
     * Aquest és el mètode per al cas recursiu
     * @return la opció del menú
     */
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
            case 3:op3();
            case 4:
                break;
            default:
                System.out.println("ERROR: Opció no vàlida!");
                menu();
                break;
        }
        return op;
    }
    public static void op3(){
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        int random1=0, random2=0, random3=0, random4=0;
        for (int i=0; i<12; i++){
            System.out.println("Introdueix el nom del jugador "+i+": ");
            player[i][0]=input.next();
            player[i][1]="0";
        }

        do {
            random1 = random.nextInt(12);
            random2 = random.nextInt(12);
            random3 = random.nextInt(12);
        }while (random1==random2 || random1==random3 || random2==random3);

        do{
            random4 = random.nextInt(12);
        }while (random4==random1 || random4==random2 || random4==random3);

        for (int i=0; i<12; i++){
            System.out.println("Començem per el jugador "+player[i][0]+", quan estiguis sol clica 's' per a continuar");
            String s=input.next();
        }



    }
}