package JavaD5HW1.business.concretes;

import JavaD5HW1.business.abstracts.UserService;
import JavaD5HW1.dataAccess.abstracts.UserDao;
import JavaD5HW1.entities.concretes.User;

import java.util.regex.Pattern;

public class UserManager implements UserService {
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);

	}

	@Override
	public void update(User user) {
        System.out.println("User information is updated");

	}
	
	@Override
	public void delete(User user) {
		userDao.delete(user);
	}
	
	@Override
	public boolean eMailCheck(String email) {
		String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(emailPattern,Pattern.CASE_INSENSITIVE);
		if(!pattern.matcher(email).find()) {
			
			System.out.println("Mail address has to have an e-mail format (example@example.com)");
		
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean getByMail(String email) {
		return false;
	}
                   
}
