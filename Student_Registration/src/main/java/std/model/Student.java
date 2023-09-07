package std.model;

public class Student {
	
	private String user_id;
	private String Password;
	private String type;
	private String Name;
	private int Age;
	private String Branch;
	private String Address;	
	private String Mobile;
	
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	
	
	@Override
	public String toString() {
		return "Student [user_id=" + user_id + ", Password=" + Password + ", type=" + type + ", Name=" + Name + ", Age="
				+ Age + ", Branch=" + Branch + ", Address=" + Address + ", Mobile=" + Mobile + "]";
	}
	

	
}
