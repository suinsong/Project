package 회원;

public class NamesVO {

	private int 회원번호;
	private String 이름;
	private String ID;
	private String 비밀번호;
	private String 전화번호;
	private String 주소;
	private String 성별;
	private String 출석횟수;
	private String 등록기간;
	private String 등급;

	public NamesVO(int 회원번호, String 이름, String ID, String 비밀번호, String 전화번호, String 주소, String 성별, String 출석횟수,
			String 등록기간, String 등급) {
		super();
		this.회원번호 = 회원번호;
		this.이름 = 이름;
		this.ID = ID;
		this.비밀번호 = 비밀번호;
		this.전화번호 = 전화번호;
		this.주소 = 주소;
		this.성별 = 성별;
		this.출석횟수 = 출석횟수;
		this.등록기간 = 등록기간;
		this.등급 = 등급;

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NamesVO [회원번호=" + 회원번호 + ", 이름=" + 이름 + ", ID=" + ID + ", 비밀번호=" + 비밀번호 + ", 전화번호=" + 전화번호 + ", 주소="
				+ 주소 + ", 성별=" + 성별 + ", 출석횟수=" + 출석횟수 + ", 등록기간=" + 등록기간 + ", 등급=" + 등급 + "]";
	}

	public int get회원번호() {
		return 회원번호;
	}

	public void set회원번호(int 회원번호) {
		this.회원번호 = 회원번호;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String get비밀번호() {
		return 비밀번호;
	}

	public void set비밀번호(String 비밀번호) {
		this.비밀번호 = 비밀번호;
	}

	public String get전화번호() {
		return 전화번호;
	}

	public void set전화번호(String 전화번호) {
		this.전화번호 = 전화번호;
	}

	public String get주소() {
		return 주소;
	}

	public void set주소(String 주소) {
		this.주소 = 주소;
	}

	public String get성별() {
		return 성별;
	}

	public void set성별(String 성별) {
		this.성별 = 성별;
	}

	public String get출석횟수() {
		return 출석횟수;
	}

	public void set출석횟수(String 출석횟수) {
		this.출석횟수 = 출석횟수;
	}

	public String get등록기간() {
		return 등록기간;
	}

	public void set등록기간(String 등록기간) {
		this.등록기간 = 등록기간;
	}

	public String get등급() {
		return 등급;
	}

	public void set등급(String 등급) {
		this.등급 = 등급;
	}

}
