package JavaD5HW1.dataAccess.abstracts;

import java.util.List;

import JavaD5HW1.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getByMail (String email);
	List<User> getAll();
}
