public class Wine extends Product {

    //polja

    private double zapreminaBoce;

    //konstruktori

    public Wine(String nazivProizvoda, int barKod, Double osnovnaCena, double zapreminaBoce) {

        super(nazivProizvoda, barKod, osnovnaCena);
        this.zapreminaBoce = zapreminaBoce;

    }

    //metode

    public void racunanjeCene() {

        double cenaProizvoda = (super.racunanjeCene(osnovnaCena)) * (1 + (POREZNAALKOHOL / 100));
        System.out.println("Osnovna cena vina je: " + osnovnaCena);
        System.out.println("Konacna cena vina je: " + cenaProizvoda);

    }

    @Override
    public String toString() {
        return "Wine{" +
                "zapreminaBoce=" + zapreminaBoce +
                ", nazivProizvoda='" + nazivProizvoda + '\'' +
                ", barKod=" + barKod +
                ", osnovnaCena=" + osnovnaCena +
                '}';
    }
}
