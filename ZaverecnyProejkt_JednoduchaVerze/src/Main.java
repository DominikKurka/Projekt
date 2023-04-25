import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        userInterface prostredi = new userInterface();

        try {
            String volba = "";
            // hlavní cyklus
            while (!volba.equals("4")) {
                prostredi.vypisUvodniObrazovku();
                volba = sc.nextLine();
                System.out.println();
                // reakce na volbu
                switch (volba) {
                    case "1":
                        prostredi.pridej();
                        break;
                    case "2":
                        prostredi.vypis();
                        break;
                    case "3":
                        prostredi.vyhledej();
                        break;
                    case "4":
                        System.out.println("Libovolnou klávesou ukončíte program...");
                        break;
                    default:
                        System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                        break;
                }
            }
        }catch (Exception ex) {
            System.out.println("Zadán neplatný údaj");
        }
    }
}