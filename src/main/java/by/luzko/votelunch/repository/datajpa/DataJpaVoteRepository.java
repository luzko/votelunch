package by.luzko.votelunch.repository.datajpa;

import by.luzko.votelunch.model.Vote;
import by.luzko.votelunch.repository.VoteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaVoteRepository implements VoteRepository {
    @Override
    public Vote save(Vote vote) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Vote get(int id) {
        return null;
    }

    @Override
    public List<Vote> getAll() {
        return null;
    }
}
