package JavaD5HW1.business.concretes;

import JavaD5HW1.business.abstracts.AuthService;
import JavaD5HW1.business.abstracts.UserService;
import JavaD5HW1.core.AutGoogleService;
import JavaD5HW1.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserService userService;
	private AutGoogleService autGoogleService;

	public AuthManager(UserService userService, AutGoogleService autGoogleService) {
		super();
		this.userService = userService;
		this.autGoogleService = autGoogleService;
	}

	@Override
	public boolean register(User user) {
	
		userService.add(user);
		return true;		
	}

	@Override
	public boolean login(User user) {
		boolean setEmail = userService.getByMail(user.getEmail());
		if(setEmail) {
			System.out.println("Successful login : " + user.getFirstName());
			return true;
		}
		else {
			System.out.println("Registration info is wrong");
		return false;
		}
	}

}
