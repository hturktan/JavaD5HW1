package JavaD5HW1.business.abstracts;

import JavaD5HW1.entities.concretes.User;

public interface UserService {
	void add(int id, String firstName, String lastName, String email, String password);
	void delete(User user);
	void login(String email, String password);
	User get(String email);
	
	
}
