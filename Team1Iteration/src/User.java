
public class User {
	private String username;
    private String password;
    private UserType userType;
    private String name;
    private String email;
    private String id;
    private String academicLevel;
    private boolean takeMeds;

    public User(String name,String id, String email,String academicLevel,boolean takeMeds,String username, String password, UserType userType) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.academicLevel = academicLevel;
        this.takeMeds = takeMeds;
    	this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserType getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                '}';
    }

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public boolean getMedication() {
		// TODO Auto-generated method stub
		return takeMeds;
	}

	public String getAcademicLevel() {
		// TODO Auto-generated method stub
		return academicLevel;
	}

	public String getID() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	
}

enum UserType {
    STUDENT, STAFF, ADMIN

}
