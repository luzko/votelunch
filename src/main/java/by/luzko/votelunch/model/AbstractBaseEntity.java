package by.luzko.votelunch.model;

import org.springframework.util.Assert;

public abstract class AbstractBaseEntity {
    public static final int START_SEQ = 100000;

    protected Integer id;

    protected AbstractBaseEntity(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public int id() {
        Assert.notNull(id, "Entity must has id");
        return id;
    }

    public boolean isNew() {
        return this.id == null;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + id;
    }
}
