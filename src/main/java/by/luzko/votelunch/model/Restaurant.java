package by.luzko.votelunch.model;

import java.util.StringJoiner;

public class Restaurant extends AbstractNamedEntity {
    public Restaurant(Integer id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Restaurant.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("id=" + id)
                .toString();
    }
}
