package by.luzko.votelunch.model;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.StringJoiner;

public class Vote extends AbstractBaseEntity {
    private LocalDateTime dateTime;

    private Restaurant restaurant;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Vote(Integer id, LocalDateTime dateTime, Restaurant restaurant, User user) {
        super(id);
        this.dateTime = dateTime;
        this.restaurant = restaurant;
        this.user = user;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Vote.class.getSimpleName() + "[", "]")
                .add("dateTime=" + dateTime)
                .add("restaurant=" + restaurant)
                .add("user=" + user)
                .add("id=" + id)
                .toString();
    }
}
