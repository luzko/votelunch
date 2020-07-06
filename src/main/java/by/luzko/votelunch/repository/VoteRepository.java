package by.luzko.votelunch.repository;

import by.luzko.votelunch.model.Vote;

import java.util.List;

public interface VoteRepository {
    // null if not found, when updated
    Vote save(Vote vote);

    // false if not found
    boolean delete(int id);

    // null if not found
    Vote get(int id);

    List<Vote> getAll();
}
