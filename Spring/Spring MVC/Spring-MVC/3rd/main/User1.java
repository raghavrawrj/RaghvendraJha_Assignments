package model1;

public class User1 {

	public String name;
	public String password;
	public String email;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User1 [name=" + name + ", password=" + password + ", email=" + email + "]";
	}

}