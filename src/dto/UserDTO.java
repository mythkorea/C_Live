package dto;

public class UserDTO {
    public String id;
    public String pw;
    public String name;
    public String phonenum;
    public String gender;
    public int age;
    public String addr;
    public String email;
	public UserDTO(String id, String pw, String name, String phonenum, String gender, int age, String addr,
			String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phonenum = phonenum;
		this.gender = gender;
		this.age = age;
		this.addr = addr;
		this.email = email;
	}
}
