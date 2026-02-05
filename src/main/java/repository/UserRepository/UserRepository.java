package repository.UserRepository;

import model.User;

import java.util.List;

public interface UserRepository {
    List<User> getAll();
    User save(User user);
    User update(User user);
    User getById(Long id);
    User getByEmail(String email);
}
