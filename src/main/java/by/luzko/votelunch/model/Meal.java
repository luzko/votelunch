package by.luzko.votelunch.model;

import java.time.LocalDate;
import java.util.StringJoiner;

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
        return new StringJoiner(", ", Meal.class.getSimpleName() + "[", "]")
                .add("price=" + price)
                .add("date=" + date)
                .add("restaurant=" + restaurant)
                .add("name='" + name + "'")
                .add("id=" + id)
                .toString();
    }
}
