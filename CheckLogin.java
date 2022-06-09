import java.util.*;


class UsernameException extends Exception{
	public UsernameException(String msg){
		super(msg);
	}
}


class PasswordException extends Exception{
	public PasswordException(String msg){
		super(msg);
	}
}


class CheckLogin{
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String username, password;
		
		System.out.println("Login");
		System.out.println("Username: ");
		username = sc.next();
		
		System.out.println("Password: ");
		password = sc.next();
		
		int length = username.length();
		
		try{
			if(length<6 || !username.equals(USERNAME)) throw new UsernameException("Invalid Username");
			else if(!password.equals(PASSWORD)) throw new PasswordException("Invalid Password");

			else System.out.println("Login successful !!!");
		}
		catch(UsernameException | PasswordExeption u)
		{
			u.printStackTrace();
		}
		finally{
			System.out.println("The finally statement is excecuted");
		}
		
	}
}