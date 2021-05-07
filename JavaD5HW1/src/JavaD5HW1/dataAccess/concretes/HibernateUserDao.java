package JavaD5HW1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import JavaD5HW1.dataAccess.abstracts.UserDao;
import JavaD5HW1.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	private ArrayList<User> users = new ArrayList<User>();
	
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("User "+ user.getFirstName() + " " + user.getLastName() + " is added.");
	}

	@Override
	public void update(User user) {
		users.add(user);
		System.out.println("Dear "+ user.getFirstName() + " " + user.getLastName() + " update is successful.");
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("User "+ user.getFirstName() + " " + user.getLastName() + " is removed.");

	}

	@Override
	public ArrayList<User> getByMail(String mail) {
		for (User user : users) {
			if(user.getEmail().equals(mail)) {
				return users;
			}else {
				return null;
			}
		}
		return users;
	
	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}

	
}
