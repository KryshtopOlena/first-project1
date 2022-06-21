package homeworks.homework14.realty;

import java.util.ArrayList;

public class RealtyMain {

    public static void main(String[] args) {

        int unitTax = 90;
        int totalAreaHouse = 100;
        int rateHouse = 30;
        int totalAreaShop = 200;
        int tradeProceeds = 100;
        int totalAreaFactory = 600;

        ArrayList<Realty> realties = new ArrayList<>();
        Realty house = new ResidentialRealty(totalAreaHouse, unitTax, rateHouse);
        realties.add(house);
        Realty shop = new CommercialRealty(totalAreaShop, unitTax, tradeProceeds);
        realties.add(shop);
        Realty factory = new IndustrialRealty(totalAreaFactory, unitTax);
        realties.add(factory);

        print(realties);
    }

    public static void print(ArrayList<Realty> realties) {
        for (Realty realty : realties) {
            realty.calculateTax();
            System.out.println(realty + " tax amounted to " + realty.calculateTax() + " UAN");
        }
    }
}
