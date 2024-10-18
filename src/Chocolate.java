public class Chocolate extends Product {

    //polja

    private double tezina;

    //konstruktori

    public Chocolate(String nazivProizvoda, int barKod, double osnovnaCena, double tezina) {

        super(nazivProizvoda, barKod, osnovnaCena);
        this.tezina = tezina;

    }

    //metode

    public void racunanjeCene() {

        double cenaProizvoda = super.racunanjeCene(osnovnaCena);
        System.out.println("Osnovna cena cokolade je: " + osnovnaCena);
        System.out.println("Konacna cena cokolade je: " + cenaProizvoda);

    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "tezina=" + tezina +
                ", nazivProizvoda='" + nazivProizvoda + '\'' +
                ", barKod=" + barKod +
                ", osnovnaCena=" + osnovnaCena +
                '}';
    }
}
