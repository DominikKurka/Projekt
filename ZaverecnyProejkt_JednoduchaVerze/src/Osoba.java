public class Osoba {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;

    public Osoba(String jmeno, String prijmeni, int vek, String telefon)
    {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " " + vek + " " + telefon;
    }
}
