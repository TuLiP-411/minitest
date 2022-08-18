package material;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.function.Consumer;

public class MaterialManager {
    public static void main(String[] args) {

        Material m1 = new CrispyFlour("001", "Bot chien ga gion AjiQuick", LocalDate.of(2022, 7, 8), 13000, 5);
        Material m2 = new CrispyFlour("002", "Bot chien xu Miwon", LocalDate.of(2022, 3, 28), 8000, 8);
        Material m3 = new CrispyFlour("003", "Bot chien Din Ky", LocalDate.of(2021, 12, 24), 6000, 10);
        Material m4 = new CrispyFlour("004", "Bot chien ngo khoai", LocalDate.of(2021, 11, 23), 10000, 15);
        Material m5 = new CrispyFlour("005", "Bot chien hai san AjiQuick", LocalDate.of(2022, 5, 16), 15000, 45);
        Material m6 = new Meat("006", "Thit ga", LocalDate.of(2022, 8, 11), 36000, 4.5);
        Material m7 = new Meat("007", "Thit bo", LocalDate.of(2022, 8, 12), 52000, 3.5);
        Material m8 = new Meat("008", "Thit lon", LocalDate.of(2022, 8, 16), 40000, 6);
        Material m9 = new Meat("009", "Thit ca", LocalDate.of(2022, 8, 15), 72000, 2);
        Material m10 = new Meat("010", "Thit cuu", LocalDate.of(2022, 8, 18), 180000, 8);

        ArrayList<Material> listMaterial = new ArrayList<Material>();
        listMaterial.add(m1);
        listMaterial.add(m2);
        listMaterial.add(m3);
        listMaterial.add(m4);
        listMaterial.add(m5);
        listMaterial.add(m6);
        listMaterial.add(m7);
        listMaterial.add(m8);
        listMaterial.add(m9);
        listMaterial.add(m10);
        System.out.println("Price different between original price and discounted price today for product: ");
        listMaterial.forEach(material -> System.out.println(material.toString() + " is " + getPriceDifferent(material)));
    }

    private static double getPriceDifferent(Material material) {
        double priceDiff = 0;
        if (material instanceof CrispyFlour) {
            CrispyFlour flour = (CrispyFlour) material;
            priceDiff = flour.getAmount() - flour.getRealMoney();
        } else if (material instanceof Meat) {
            Meat meat = (Meat) material;
            priceDiff = meat.getAmount() - meat.getRealMoney();
        }
        return priceDiff;
    }


}

