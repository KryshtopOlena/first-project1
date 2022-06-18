package homeworks.homework14.Task1;

public class RealtyMain {

    public static void main(String[] args) {

        int unitTax = 90;
        int totalAreaHouse = 125;
        int rateHouse = 30;
        int totalAreaShop = 200;
        int tradeProceeds = 100;
        int totalAreaFactory = 600;

        Realty house = new ResidentialRealty(totalAreaHouse, unitTax, rateHouse);
        Realty shop = new CommercialRealty(totalAreaShop, unitTax, tradeProceeds);
        Realty factory = new IndustrialRealty(totalAreaFactory, unitTax);

        System.out.println(house + " tax amounted to " + house.calculateTax() + " UAN");
        System.out.println(shop + " tax amounted to " + shop.calculateTax() + " UAN");
        System.out.println(factory + " tax amounted to " + factory.calculateTax() + " UAN");

    }
}
