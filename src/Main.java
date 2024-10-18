public class Main {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Milka", 65465465, 100.0, 80.0);
        System.out.println(chocolate);
        chocolate.racunanjeCene();

        Wine wine = new Wine("Merlot", 54545454, 500.0, 0.75);
        System.out.println(wine);
        wine.racunanjeCene();
    }
}