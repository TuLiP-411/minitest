package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Meat extends Material implements Discount, Serializable {
    private double weight;

    public Meat() {
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
        return (this.getCost() * this.weight);
    }

    @Override
    public double getRealMoney() {
        return 0;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }
}
