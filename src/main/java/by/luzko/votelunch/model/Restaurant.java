package by.luzko.votelunch.model;

public class Restaurant extends AbstractNamedEntity {
    public Restaurant(Integer id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Restaurant{");
        sb.append("id=").append(id).append('\'');
        sb.append(", name='").append(name);
        sb.append('}');
        return sb.toString();
    }
}
