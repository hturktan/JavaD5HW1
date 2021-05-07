package JavaD5HW1.core;

import JavaD5HW1.AutGoogle.AuthGoogle;


public class AutGoogleAdapter implements AutGoogleService{
	private AuthGoogle authGoogle;
	

	public AutGoogleAdapter(AuthGoogle authGoogle) {
		super();
		this.authGoogle = authGoogle;

	}
	
	@Override
	public void loginByGoogle(String message) {
		authGoogle.loginByGoogle(message);
	}

	
}