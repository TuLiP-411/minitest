package material;

import discount.Discount;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    public static final int TWO_MONTHS_DISCOUNT = 30;
    public static final int FOUR_MONTHS_DISCOUNT = 20;
    public static final int GENERAL_DISCOUNT = 5;
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        double amount = quantity * getCost();
        return amount;
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate expiryDate = getManufacturingDate().plusYears(1);
        return expiryDate;
    }

    @Override
    public String toString() {
        return "CrispyFlour {" +
                "name= " + getName() +
                ", id= " + getId() +
                ", manufactured from " + getManufacturingDate() +
                ", expire in " + getExpiryDate() +
                ", quantity= " + quantity +
                '}';
    }

    @Override
    public double getRealMoney() {
        double realMoney;
        int remainPeriod = LocalDate.now().compareTo(getManufacturingDate());
        if (remainPeriod <= 2) {
            realMoney = getAmount() * (100 - TWO_MONTHS_DISCOUNT) / 100;
        } else if (remainPeriod <= 4) {
            realMoney = getAmount() * (100 - FOUR_MONTHS_DISCOUNT) / 100;
        } else {
            realMoney = getAmount() * (100 - GENERAL_DISCOUNT) / 100;
        }
        return realMoney;
    }
}
