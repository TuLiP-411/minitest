package material;

import discount.Discount;

import java.time.Duration;
import java.time.LocalDate;

public class Meat extends Material implements Discount {
    public static final int FIVE_DAYS_DISCOUNT = 30;
    public static final int GENERAL_DISCOUNT = 10;
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        double amount = weight * getCost();
        return amount;
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate expiryDate = getManufacturingDate().plusDays(7);
        return expiryDate;
    }


    @Override
    public String toString() {
        return "Meat {" +
                "name= " + getName() +
                ", id= " + getId() +
                ", manufactured from " + getManufacturingDate() +
                ", expire in " + getExpiryDate() +
                ", weight=" + weight +
                '}';
    }

    @Override
    public double getRealMoney() {
        double realMoney = 0;
        try {
            long remainPeriod = (Duration.between(LocalDate.now(), getExpiryDate()).toDays());
            if (remainPeriod <= 5) {
                realMoney = getAmount() * (100 - FIVE_DAYS_DISCOUNT) / 100;
            } else {
                realMoney = getAmount() * (100 - GENERAL_DISCOUNT) / 100;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return realMoney;

    }
}
