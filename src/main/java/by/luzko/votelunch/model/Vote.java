package by.luzko.votelunch.model;

import java.time.LocalDateTime;

public class Vote extends AbstractBaseEntity{
    private LocalDateTime dateTime;

    private Restaurant restaurant;

    private User user;

    public Vote(Integer id, LocalDateTime dateTime, Restaurant restaurant, User user) {
        super(id);
        this.dateTime = dateTime;
        this.restaurant = restaurant;
        this.user = user;
    }
}
