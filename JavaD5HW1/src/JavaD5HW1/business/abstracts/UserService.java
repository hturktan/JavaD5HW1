package JavaD5HW1.business.abstracts;

import JavaD5HW1.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	boolean eMailCheck(String email);
	boolean getByMail(String email);
			
}
