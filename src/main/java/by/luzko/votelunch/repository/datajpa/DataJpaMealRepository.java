package by.luzko.votelunch.repository.datajpa;

import by.luzko.votelunch.model.Meal;
import by.luzko.votelunch.repository.MealRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaMealRepository implements MealRepository {
    @Override
    public Meal save(Meal meal) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Meal get(int id) {
        return null;
    }

    @Override
    public List<Meal> getAll() {
        return null;
    }
}
