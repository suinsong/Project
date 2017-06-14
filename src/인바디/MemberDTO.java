package 인바디;

public class MemberDTO {

	private int 회원번호; // 사용자 ID
	private String 이름;
	private String 키;
	private String 체중;
	private String 골격근량;
	private String 근육량;
	private String 체지방량;
	private String 남;
	private String 여;
	private String BMI;
	private String 체지방률;

	public MemberDTO(int id, int 회원번호, String 이름, String 키, String 체중, String 골격근량, String 근육량, String 체지방량, String 남,
			String 여, String bMI, String 체지방률) {
		super();
		this.회원번호 = 회원번호;
		this.이름 = 이름;
		this.키 = 키;
		this.체중 = 체중;
		this.골격근량 = 골격근량;
		this.근육량 = 근육량;
		this.체지방량 = 체지방량;
		this.남 = 남;
		this.여 = 여;
		BMI = bMI;
		this.체지방률 = 체지방률;
	}

	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
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

	public String get키() {
		return 키;
	}

	public void set키(String 키) {
		this.키 = 키;
	}

	public String get체중() {
		return 체중;
	}

	public void set체중(String 체중) {
		this.체중 = 체중;
	}

	public String get골격근량() {
		return 골격근량;
	}

	public void set골격근량(String 골격근량) {
		this.골격근량 = 골격근량;
	}

	public String get근육량() {
		return 근육량;
	}

	public void set근육량(String 근육량) {
		this.근육량 = 근육량;
	}

	public String get체지방량() {
		return 체지방량;
	}

	public void set체지방량(String 체지방량) {
		this.체지방량 = 체지방량;
	}

	public String get남() {
		return 남;
	}

	public void set남(String 남) {
		this.남 = 남;
	}

	public String get여() {
		return 여;
	}

	public void set여(String 여) {
		this.여 = 여;
	}

	public String getBMI() {
		return BMI;
	}

	public void setBMI(String bMI) {
		BMI = bMI;
	}

	public String get체지방률() {
		return 체지방률;
	}

	public void set체지방률(String 체지방률) {
		this.체지방률 = 체지방률;
	}

	@Override
	public String toString() {
		return "MemberDTO [회원번호=" + 회원번호 + ", 이름=" + 이름 + ", 키=" + 키 + ", 체중=" + 체중 + ", 골격근량=" + 골격근량
				+ ", 근육량=" + 근육량 + ", 체지방량=" + 체지방량 + ", 남=" + 남 + ", 여=" + 여 + ", BMI=" + BMI + ", 체지방률=" + 체지방률 + "]";
	}

}
