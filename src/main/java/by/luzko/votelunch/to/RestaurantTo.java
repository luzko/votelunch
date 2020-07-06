package by.luzko.votelunch.to;

import by.luzko.votelunch.model.Meal;

import java.util.List;
import java.util.StringJoiner;

public class RestaurantTo {
    private final Integer id;

    private final String name;

    private final List<Meal> menu;

    private final int voteCount;

    public RestaurantTo(Integer id, String name, List<Meal> menu, int voteCount) {
        this.id = id;
        this.name = name;
        this.menu = menu;
        this.voteCount = voteCount;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Meal> getMenu() {
        return menu;
    }

    public int getVoteCount() {
        return voteCount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RestaurantTo.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("menu=" + menu)
                .add("voteCount=" + voteCount)
                .toString();
    }
}
