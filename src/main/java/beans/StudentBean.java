package beans;
import java.io.Serializable;
public class StudentBean implements Serializable {
	private static final long serialVersionID=1L;
	private String uname;
	private String pw;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}

}
