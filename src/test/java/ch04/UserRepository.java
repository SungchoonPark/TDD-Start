package ch04;

public interface UserRepository {
    void save(User user);
    User findById(String id);
}
