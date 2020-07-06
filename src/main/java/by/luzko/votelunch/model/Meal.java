package by.luzko.votelunch.model;

import java.time.LocalDate;

public class Meal extends AbstractNamedEntity {
    private double price;

    private LocalDate date;

    private Restaurant restaurant;

    public Meal(String name, double price, LocalDate date) {
        this(null, name, price, date);
    }

    public Meal(Integer id, String name, double price, LocalDate date) {
        super(id, name);
        this.price = price;
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meal{");
        sb.append(", id=").append(id);
        sb.append(", name='").append(name);
        sb.append("price=").append(price);
        sb.append(", restaurant=").append(restaurant);
        sb.append(", date=").append(date).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
