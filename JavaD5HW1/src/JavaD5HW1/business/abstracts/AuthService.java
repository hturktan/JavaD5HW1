package JavaD5HW1.business.abstracts;

import JavaD5HW1.entities.concretes.User;

public interface AuthService {
	boolean register(User user);
	boolean login(User user);
}
