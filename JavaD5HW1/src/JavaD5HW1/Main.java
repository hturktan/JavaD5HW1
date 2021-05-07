package JavaD5HW1;

import JavaD5HW1.business.abstracts.UserService;
import JavaD5HW1.business.concretes.AuthManager;
import JavaD5HW1.business.concretes.UserManager;
import JavaD5HW1.core.AutGoogleAdapter;
import JavaD5HW1.dataAccess.concretes.HibernateUserDao;
import JavaD5HW1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
	
				
		User user1 = new User(1,"Ahmet","Can","ahmet@can.com","1234356");
		User user2 = new User(2, "Mehmet","Hasan", "mehmet@hasan","147369");
		
		
	
		
		AuthManager authManager=new AuthManager(new UserManager(new HibernateUserDao()), new AutGoogleAdapter(null));
		authManager.register(user1);
		System.out.println(" ");
		authManager.register(user2);
		System.out.println(" ");
	
		 
		authManager.login(user1);
		System.out.println(" ");
		authManager.login(user2);
		System.out.println(" ");

	}

}
