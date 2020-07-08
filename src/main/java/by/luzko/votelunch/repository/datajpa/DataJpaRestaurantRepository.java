package by.luzko.votelunch.repository.datajpa;

import by.luzko.votelunch.model.Restaurant;
import by.luzko.votelunch.repository.RestaurantRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaRestaurantRepository implements RestaurantRepository {
    @Override
    public Restaurant save(Restaurant restaurant) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Restaurant get(int id) {
        return null;
    }

    @Override
    public List<Restaurant> getAll() {
        return null;
    }
}
