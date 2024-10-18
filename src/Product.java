public class Product {

    //polja
    protected String nazivProizvoda;
    protected int barKod;
    protected double osnovnaCena;
    protected static final double PDV = 20.0;
    protected static final double POREZNAALKOHOL = 10.0;

//konstruktori

    protected Product() {
    }

    protected Product(String nazivProizvoda, int barKod, double osnovnaCena) {

        this.nazivProizvoda = nazivProizvoda;
        this.barKod = barKod;
        this.osnovnaCena = osnovnaCena;

    }

//metode

    protected double racunanjeCene(double osnovnaCena) {

        double cenaProizvoda = osnovnaCena * (1 + (PDV / 100));
        return cenaProizvoda;

    }
}
