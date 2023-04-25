import java.util.ArrayList;

public class Databaze {

    private ArrayList<Osoba> osoby;

    public Databaze() {
        osoby = new ArrayList<>();
    }

    public void pridejOsobu(String jmeno, String prijmeni, int vek, String telefon)
    {
        osoby.add(new Osoba(jmeno, prijmeni, vek, telefon));
    }

    public ArrayList<Osoba> vsechnyOsoby()
    {
        ArrayList<Osoba> nalezeneOsoby = new ArrayList<>();
        for (Osoba s : osoby)
            nalezeneOsoby.add(s);
        return nalezeneOsoby;
    }

    public ArrayList<Osoba> najdiOsobu(String jmeno, String prijmeni)
    {
        ArrayList<Osoba> nalezenaOsoba = new ArrayList<>();
        for(Osoba o : osoby)
        {
            if(o.getJmeno().toLowerCase().equals(jmeno) && o.getPrijmeni().toLowerCase().equals(prijmeni))
                nalezenaOsoba.add(o);
        }
        return nalezenaOsoba;
    }
}
