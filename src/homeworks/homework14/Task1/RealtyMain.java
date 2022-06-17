package homeworks.homework14.Task1;

public class RealtyMain {

    public static void main(String[] args) {

        int unitTax = 90;
        int totalAreaHouse = 125;
        int rateHouse = 30;
        int totalAreaShop = 200;
        int tradeProceeds = 100;
        int totalAreaFactory = 600;


        ResidentialRealty house = new ResidentialRealty(totalAreaHouse, unitTax, rateHouse);
        CommercialRealty shop = new CommercialRealty(totalAreaShop, unitTax, tradeProceeds);
        IndustrialRealty factory = new IndustrialRealty(totalAreaFactory, unitTax);

        System.out.println("На житлову нерухомість " + house);
        System.out.println("На торгову нерухомість " + shop);
        System.out.println("На промислову нерухомість " + factory);

    }
}
