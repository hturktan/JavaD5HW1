package JavaD5HW1.dataAccess.abstracts;

import java.util.ArrayList;

import JavaD5HW1.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	ArrayList<User> getByMail (String email);
	User get(int id);
}
