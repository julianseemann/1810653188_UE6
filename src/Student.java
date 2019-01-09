public class Student
{
    private String name;
    private int matrikelnummer;
    private int jahrgang;

    public Student(String name, int matrikelnummer, int jahrgang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.jahrgang = jahrgang;
    }

    @Override
    public String toString (){
        return String.format("Name: %s \nMatrikelnummer: %d \nJahrgang: %d\n\n", getName(), getMatrikelnummer(), getJahrgang());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer)
    {
        this.matrikelnummer = matrikelnummer;
    }

    public int getJahrgang()
    {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }
}
