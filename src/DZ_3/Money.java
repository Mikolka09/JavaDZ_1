package DZ_3;

public class Money {
    int dollar;
    int euro;
    int grn;
    int cent;
    int eurocent;
    int kop;

    public void printDollars(int dollar, int cent) {
        System.out.println("Summa: " + dollar + "." + cent + " dollars");
    }

    public void printEuro(int euro, int eurocent) {
        System.out.println("Summa: " + euro + "." + eurocent + " euros");
    }

    public void printGrn(int grn, int kop) {
        System.out.println("Summa: " + grn + "." + kop + " grivnes");
    }
}
