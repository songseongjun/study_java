package domain;

public class Customer {
// 이름 ,연락처,이메일,회원번호,아이디,비밀번호
	private int no; //회원번호
	private String name; //이름
	private String tel; //
	private String email;
	private String pw;
	private String id;

	
	//기본생성자
	//모든필드사용 생성자 alt+s누르고 s한번더누르고 하면 필드생성자생성
	//getter/setter //alt+s 누르고 GetSet찾아서 만들어주기 alt+s누르고 v누르면 오버라이딩
	public Customer() {}

	public Customer(int no, String name, String tel, String email, String pw,String id) {
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.id= id;
		this.pw = pw;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Customer [no=%s, name=%s, tel=%s, email=%s, pw=%s, id=%s]", no, name, tel, email, pw, id);
	}
	

}
