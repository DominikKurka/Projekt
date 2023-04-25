import java.awt.dnd.DragGestureEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class userInterface {

    private static Scanner sc = new Scanner(System.in);
    private Databaze databaze;

    public userInterface()
    {
        databaze = new Databaze();
    }
    public void vypisUvodniObrazovku()
    {
        System.out.println("-----------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("-----------------------");
        System.out.println("Vyber si akci: ");
        System.out.println("1 - Přidat nového pojišteného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
    }
    public void pridej()
    {
        System.out.println("Zadej jméno pojištěného: ");
        String jmeno = sc.nextLine();
        System.out.println("Zadej příjmení pojištěného: ");
        String prijmeni = sc.nextLine();
        System.out.println("Zadej věk pojištěného: ");
        int vek;
        try {
            vek = Integer.parseInt(sc.nextLine());
        }catch (Exception e)
        {
            System.out.println("Věk může obsahovat pouze číslice");
            return;
        }
        System.out.println("Zadej tel. číslo pojištěného: ");
        String telefon = sc.nextLine();

        //if(prijmeni.matches("[a-zA-Z]") && jmeno.matches("[a-zA-Z]"))  Nereaguje na diakritiku
        if(prijmeni.chars().allMatch(Character::isLetter) && jmeno.chars().allMatch(Character::isLetter)) {
            databaze.pridejOsobu(jmeno, prijmeni, vek, telefon);
            System.out.println("Osoba byla přidána do databáze");
        }
        else
            System.out.println("Jméno nebo příjmení obsahuje neplatný znak");
    }

    public void vypis()
    {
        ArrayList<Osoba> osoby = databaze.vsechnyOsoby();
        if(osoby.size() != 0) {
            System.out.println("Osoby v databázi: ");
            for (Osoba osoba : osoby) {
                System.out.println(osoba);
            }
        }else
            System.out.println("Databáze je prázdná");
    }

    public void vyhledej()
    {
        System.out.println("Zadej jméno");
        String jmeno = sc.nextLine().toLowerCase().trim();
        System.out.println("Zadej příjmení");
        String prijmeni = sc.nextLine().toLowerCase().trim();
        ArrayList<Osoba> osoba = databaze.najdiOsobu(jmeno, prijmeni);
                if(osoba.size()>0)
                {
                    System.out.println("Byla nalezena tato osoba");
                    System.out.println(osoba);
                }
                else
                    System.out.println("Žádná osoba nebyla nalezena");
    }
}
